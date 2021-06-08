package com.kstu.thesis.controller

import com.kstu.thesis.components.CacheService
import com.kstu.thesis.utils.changeUIState
import javafx.fxml.FXML
import javafx.scene.control.Label
import net.rgielen.fxweaver.core.FxmlView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
@FxmlView("/choose.fxml")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
class ChooseController @Autowired constructor(
    private val cacheService: CacheService
) {

    @FXML
    private lateinit var questionTitle: Label

    @PostConstruct
    fun init() {
        println("ChooseConstruct")
        changeUIState {
            questionTitle.text = cacheService.getData("choose")
        }
    }

}
