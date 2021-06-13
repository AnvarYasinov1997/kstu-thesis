package com.kstu.thesis.service

import com.kstu.thesis.components.CacheService
import com.kstu.thesis.controller.ChooseController
import com.kstu.thesis.controller.MainController
import com.kstu.thesis.utils.Screen
import com.kstu.thesis.utils.changeUIState
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import net.rgielen.fxweaver.core.FxWeaver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

interface NavigationService {
    fun navigateScreen(screen: Screen, data: Any? = null)
}

interface NavigationServiceConfigurer {
    fun setStage(primaryStage: Stage)
}

@Service
open class DefaultNavigationService @Autowired constructor(
    private val fxWeaver: FxWeaver,
    private val cacheService: CacheService
) : NavigationService, NavigationServiceConfigurer {

    private lateinit var primaryStage: Stage

    override fun navigateScreen(screen: Screen, data: Any?) {
        when (screen) {
            is Screen.Main -> {
                newScreen(fxWeaver.loadView(MainController::class.java))
            }
            is Screen.Choose -> {
                data?.let { value -> cacheService.putData("choose", value) }
                newScreen(fxWeaver.loadView(ChooseController::class.java))
            }
//            is Screen.Code -> newScreen(fxWeaver.loadView(CodeController::class.java))
//            is Screen.Content -> newScreen(fxWeaver.loadView(ContentController::class.java))
        }
    }

    private fun newScreen(root: Parent) {
        changeUIState {
            val scene = Scene(root)
            primaryStage.scene = scene
            primaryStage.show()
        }
    }

    override fun setStage(primaryStage: Stage) {
        this.primaryStage = primaryStage
    }

}
