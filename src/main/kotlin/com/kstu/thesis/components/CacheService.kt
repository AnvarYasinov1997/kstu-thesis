package com.kstu.thesis.components

import org.springframework.stereotype.Component
import java.util.concurrent.ConcurrentHashMap

@Component
open class CacheService {

    private val cache = ConcurrentHashMap<String, Any>()

    fun putData(key: String, value: Any) {
        cache[key.toUpperCase()] = value
    }

    fun <T> getData(key: String, type: Class<T>): T {
        return cache[key.toUpperCase()].let(type::cast)
    }

}
