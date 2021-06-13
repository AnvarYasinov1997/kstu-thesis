package com.kstu.thesis.controller

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.kstu.thesis.components.CacheService
import com.kstu.thesis.entity.QuestionsEntity
import com.kstu.thesis.repository.QuestionsRepository
import com.kstu.thesis.service.NavigationService
import com.kstu.thesis.utils.Screen
import com.kstu.thesis.utils.changeUIState
import com.kstu.thesis.utils.reactiveLet
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import net.rgielen.fxweaver.core.FxmlView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers
import javax.annotation.PostConstruct

@Component
@FxmlView("/choose.fxml")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
class ChooseController @Autowired constructor(
    private val cacheService: CacheService,
    private var objectMapper: ObjectMapper,
    private val navigationService: NavigationService,
    private val questionsRepository: QuestionsRepository
) {

    @FXML
    private lateinit var noButton: Button

    @FXML
    private lateinit var yesButton: Button

    @FXML
    private lateinit var returnButton: Button

    @FXML
    private lateinit var questionTitle: Label

    private val typeRef = object : TypeReference<Map<String, String>>() {}

    @PostConstruct
    fun init() {
        val transitionData = cacheService.getData("choose", ChooseTransitionData::class.java)
        val question = transitionData.questions[transitionData.currentQuestionNumber.toString()]
        changeUIState {
            if (question == null) {
                val questionId = transitionData.answersCheckSum.substringBefore("-").toLong()
                val checkSum = transitionData.answersCheckSum.substringAfter("-")
                questionId
                    .reactiveLet(questionsRepository::findById)
                    .switchIfEmpty(Mono.error(RuntimeException()))
                    .subscribeOn(Schedulers.elastic())
                    .publishOn(Schedulers.parallel())
                    .map(QuestionsEntity::answersJson)
                    .map(this::serializeData)
                    .map { data -> data[checkSum].let(::requireNotNull) }
                    .onErrorReturn("Ответ не найден!")
                    .subscribe { answer ->
                        changeUIState {
                            questionTitle.text = answer
                            noButton.isVisible = false
                            yesButton.isVisible = false
                            returnButton.isVisible = true
                            returnButton.setOnMouseClicked {
                                navigationService.navigateScreen(Screen.Main)
                            }
                        }
                    }
                return@changeUIState
            }
            questionTitle.text = question
            noButton.setOnMouseClicked {
                navigationService.navigateScreen(Screen.Choose, transitionData.copy(
                    currentQuestionNumber = transitionData.currentQuestionNumber + 1
                ))
            }
            yesButton.setOnMouseClicked {
                navigationService.navigateScreen(Screen.Choose, transitionData.copy(
                    currentQuestionNumber = transitionData.currentQuestionNumber + 1,
                    answersCheckSum = transitionData.answersCheckSum + transitionData.currentQuestionNumber
                ))
            }
        }
    }

    private fun serializeData(data: String): Map<String, String> = objectMapper.readValue(data, typeRef)

    data class ChooseTransitionData(
        val currentQuestionNumber: Int,
        val questions: Map<String, String>,
        val answersCheckSum: String
    )

}
