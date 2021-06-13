package com.kstu.thesis.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "database")
data class DbCredentials(
    var url: String = "",
    var username: String = "",
    var password: String = "",
    var dbName: String = "",
    var port: String = ""
)
