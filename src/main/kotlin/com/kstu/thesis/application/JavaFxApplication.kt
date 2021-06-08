package com.kstu.thesis.application

import com.kstu.thesis.controller.MainController
import com.kstu.thesis.service.NavigationServiceConfigurer
import javafx.application.Application
import javafx.application.Platform
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import net.rgielen.fxweaver.core.FxWeaver
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.ConfigurableApplicationContext

open class JavaFxApplication : Application() {

    private lateinit var applicationContext: ConfigurableApplicationContext

    override fun init() {
        this.applicationContext = SpringApplicationBuilder()
            .sources(SpringBootApplication::class.java)
            .run(* parameters.raw.toTypedArray())
    }

    override fun start(primaryStage: Stage) {
        this.configureNavigator(primaryStage)
        val fxWeaver = applicationContext.getBean(FxWeaver::class.java)
        val root: Parent = fxWeaver.loadView(MainController::class.java)
        val scene = Scene(root)
        primaryStage.scene = scene
        primaryStage.show()
    }

    override fun stop() {
        applicationContext.close()
        Platform.exit()
    }

    private fun configureNavigator(primaryStage: Stage) {
        applicationContext.getBean(NavigationServiceConfigurer::class.java)
            .setStage(primaryStage)
    }

}
