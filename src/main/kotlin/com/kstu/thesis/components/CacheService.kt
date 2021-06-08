package com.kstu.thesis.components

import org.springframework.stereotype.Component
import java.util.concurrent.ConcurrentHashMap

@Component
open class CacheService {

    private val cache = ConcurrentHashMap<String, String>()

    fun putData(key: String, value: String) {
        cache[key.toUpperCase()] = value
    }

    fun getData(value: String): String {
        return cache[value.toUpperCase()].let(::requireNotNull)
    }

}
