package com.kstu.thesis.repository

import org.springframework.stereotype.Repository

@Repository
interface DataRepository {

    fun findByPattern(text: String): DataEntity

}
