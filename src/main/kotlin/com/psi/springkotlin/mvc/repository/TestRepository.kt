package com.psi.springkotlin.mvc.repository

import com.psi.springkotlin.mvc.model.USER
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TestRepository : CrudRepository<USER, Long>