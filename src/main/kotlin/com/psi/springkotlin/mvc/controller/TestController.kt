package com.psi.springkotlin.mvc.controller

import com.psi.springkotlin.mvc.model.USER
import com.psi.springkotlin.mvc.repository.TestRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/test")
class TestController(private val testRepository: TestRepository) {
    @GetMapping("")
    fun findAll(): Iterable<USER>? = testRepository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = testRepository.findById(id)

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) = testRepository.deleteById(id)

    @PutMapping("")
    fun updateUser (@RequestBody user: USER) = testRepository.save(user)

    @PostMapping("")
    fun insertUser (@RequestBody user: USER) = testRepository.save(user)
}