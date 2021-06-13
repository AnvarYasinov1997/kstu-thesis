package com.kstu.thesis.repository.base

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.r2dbc.core.DatabaseClient
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface BaseRepository<T> {
    fun findById(id: Long): Mono<T>
    fun findAll(): Flux<T>
    fun save(entity: T): Mono<T>
    fun saveAll(entityList: List<T>): Flux<T>
    fun deleteById(id: Long): Mono<Void>
    fun fetchAllByQuery(query: String): Flux<T>
    fun fetchOneByQuery(query: String): Mono<T>
}

abstract class DefaultBaseRepository<T>(
    private val entityClass: Class<T>,
    private val repository: ReactiveCrudRepository<T, Long>
) : BaseRepository<T> {

    @Autowired
    protected lateinit var dbClient: DatabaseClient

    override fun findById(id: Long): Mono<T> = repository.findById(id)

    override fun findAll(): Flux<T> = repository.findAll()

    override fun save(entity: T): Mono<T> = repository.save(entity)

    override fun saveAll(entityList: List<T>): Flux<T> = repository.saveAll(entityList)

    override fun deleteById(id: Long): Mono<Void> = repository.deleteById(id)

    override fun fetchAllByQuery(query: String): Flux<T> = dbClient.execute(query)
        .`as`(entityClass)
        .fetch()
        .all()

    override fun fetchOneByQuery(query: String): Mono<T> = dbClient.execute(query)
        .`as`(entityClass)
        .fetch()
        .first()

}
