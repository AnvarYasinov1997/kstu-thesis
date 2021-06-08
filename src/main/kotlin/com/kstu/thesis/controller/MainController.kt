package com.kstu.thesis.controller

import com.kstu.thesis.service.NavigationService
import com.kstu.thesis.utils.Screen
import javafx.fxml.FXML
import javafx.scene.control.Label
import net.rgielen.fxweaver.core.FxmlView
import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.BeanFactoryAware
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
@FxmlView("/main.fxml")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
open class MainController @Autowired constructor(
    private val navigationService: NavigationService
) {

    @PostConstruct
    open fun init() {
        println("MainConstruct")
        navigationService.navigateScreen(Screen.Choose, "Hui")
    }

}
