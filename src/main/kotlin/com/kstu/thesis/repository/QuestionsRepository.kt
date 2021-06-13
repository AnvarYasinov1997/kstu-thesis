package com.kstu.thesis.repository

import com.kstu.thesis.entity.QuestionsEntity
import com.kstu.thesis.repository.base.BaseRepository
import com.kstu.thesis.repository.base.DefaultBaseRepository
import com.kstu.thesis.repository.crud.QuestionsCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

interface QuestionsRepository : BaseRepository<QuestionsEntity> {
    fun findAllBySearchNamePattern(pattern: String): Flux<QuestionsEntity>
}

@Repository
open class DefaultQuestionsRepository(crud: QuestionsCrudRepository) :
    DefaultBaseRepository<QuestionsEntity>(QuestionsEntity::class.java, crud), QuestionsRepository {

    override fun findAllBySearchNamePattern(pattern: String): Flux<QuestionsEntity> {
        val query = "select * from questions where search_name like '%$pattern%'"

        return fetchAllByQuery(query)
    }

}
