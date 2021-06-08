package com.kstu.thesis.utils

import javafx.application.Platform

fun changeUIState(callBack: () -> Unit) {
    Platform.runLater {
        callBack.invoke()
    }
}
