package com.kstu.thesis.repository.crud

import com.kstu.thesis.entity.QuestionsEntity
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface QuestionsCrudRepository : ReactiveCrudRepository<QuestionsEntity, Long>
