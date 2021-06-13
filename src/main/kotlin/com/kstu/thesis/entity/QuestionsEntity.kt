package com.kstu.thesis.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("questions")
data class QuestionsEntity(

    @Id
    val id: Long? = null,

    @Column("search_name")
    val searchName: String,

    @Column("questions_json")
    val questionsJson: String,

    @Column("answers_json")
    val answersJson: String

)
