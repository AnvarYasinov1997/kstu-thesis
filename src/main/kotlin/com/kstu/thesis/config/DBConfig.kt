package com.kstu.thesis.config

import com.kstu.thesis.property.DbCredentials
import io.r2dbc.postgresql.PostgresqlConnectionConfiguration
import io.r2dbc.postgresql.PostgresqlConnectionFactory
import io.r2dbc.spi.ConnectionFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableR2dbcRepositories(basePackages = ["com.kstu.thesis.repository"])
@EnableTransactionManagement
open class DBConfig(
    private val dbCredentials: DbCredentials
) : AbstractR2dbcConfiguration() {

    @Bean
    override fun connectionFactory(): ConnectionFactory = PostgresqlConnectionConfiguration.builder()
            .host(dbCredentials.url)
            .port(dbCredentials.port.toInt())
            .username(dbCredentials.username)
            .password(dbCredentials.password)
            .database(dbCredentials.dbName)
            .build()
            .let(::PostgresqlConnectionFactory)

}
