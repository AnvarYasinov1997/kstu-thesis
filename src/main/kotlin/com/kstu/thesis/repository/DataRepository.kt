package com.kstu.thesis.repository

import org.springframework.stereotype.Repository

@Repository
open class DataRepository {

    fun findByPattern(text: String): DataEntity {
        return DataEntity(
            data = "",
            searchName = ""
        )
    }

}
