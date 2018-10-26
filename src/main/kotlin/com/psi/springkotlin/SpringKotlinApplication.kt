package com.psi.springkotlin

import com.psi.springkotlin.mvc.model.USER
import com.psi.springkotlin.mvc.repository.TestRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringKotlinApplication {
    private val logger = LoggerFactory.getLogger(SpringKotlinApplication::class.java)

    @Bean
    fun init(testRepository: TestRepository) = CommandLineRunner {
        logger.info("H2 Database init delete")
        testRepository.deleteAll()
        logger.info("H2 Database init insert")
        testRepository.save(USER("Tom", "tom@tom.com"))
        testRepository.save(USER("Jaker", "jaker@jaker.com"))
        testRepository.save(USER("Baker", "baker@baker.com"))
        testRepository.save(USER("Jack", "jack@jack.com"))
        logger.info("End Database Init")
    }
}

fun main(args: Array<String>) {
    runApplication<SpringKotlinApplication>(*args)
}
