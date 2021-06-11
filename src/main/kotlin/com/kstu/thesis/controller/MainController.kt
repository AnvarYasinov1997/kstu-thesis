package com.kstu.thesis.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.kstu.thesis.repository.DataEntity
import com.kstu.thesis.repository.DataRepository
import com.kstu.thesis.service.NavigationService
import com.kstu.thesis.utils.changeUIState
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextField
import net.rgielen.fxweaver.core.FxmlView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
@FxmlView("/main.fxml")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
open class MainController @Autowired constructor(
    private var objectMapper: ObjectMapper,
    private val dataRepository: DataRepository,
    private val navigationService: NavigationService
) {

    @FXML
    private lateinit var searchButton: Button

    @FXML
    private lateinit var searchInput: TextField

    @PostConstruct
    open fun init() {
        println("MainConstruct")
//        navigationService.navigateScreen(Screen.Choose, "Hui")
        e()
    }

    private fun e() {
        changeUIState {
            searchButton.setOnMouseClicked {
                searchInput.text
                    .let(dataRepository::findByPattern)
                    .let(DataEntity::data)
                    .let { data -> objectMapper.readValue(data, Map::class.java) }
            }
        }
    }

}
