package com.psi.springkotlin.mvc.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class USER(
        val name: String,
        val email: String,
        @Id
        @GeneratedValue
        val id: Long = -1)