package com.kstu.thesis.controller

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.kstu.thesis.repository.QuestionsRepository
import com.kstu.thesis.service.NavigationService
import com.kstu.thesis.utils.Screen
import com.kstu.thesis.utils.changeUIState
import com.kstu.thesis.utils.reactiveLet
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextField
import net.rgielen.fxweaver.core.FxmlView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers
import javax.annotation.PostConstruct


@Component
@FxmlView("/main.fxml")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
open class MainController @Autowired constructor(
    private var objectMapper: ObjectMapper,
    private val questionsRepository: QuestionsRepository,
    private val navigationService: NavigationService
) {

    @FXML
    private lateinit var searchButton: Button

    @FXML
    private lateinit var searchInput: TextField

    private val typeRef = object : TypeReference<Map<String, String>>() {}

    @PostConstruct
    open fun init() {
        viewCreated()
    }

    private fun viewCreated() {
        changeUIState {
            searchButton.setOnMouseClicked {
                searchInput.text
                    .let(String::toLowerCase)
                    .reactiveLet(questionsRepository::findAllBySearchNamePattern)
                    .subscribeOn(Schedulers.elastic())
                    .flatMap { questionsEntity ->
                        Mono.just(questionsEntity.questionsJson)
                            .publishOn(Schedulers.parallel())
                            .map(this::serializeData)
                            .map { data ->
                                ChooseController.ChooseTransitionData(
                                    currentQuestionNumber = 0,
                                    questions = data,
                                    answersCheckSum = questionsEntity.id!!.toString() + "-"
                                )
                            }
                    }
                    .subscribe { data ->
                        changeUIState {
                            navigationService.navigateScreen(Screen.Choose, data)
                        }
                    }
            }
        }
    }

    private fun serializeData(data: String): Map<String, String> = objectMapper.readValue(data, typeRef)

}
