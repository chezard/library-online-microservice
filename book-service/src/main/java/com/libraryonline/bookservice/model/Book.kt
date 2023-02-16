package com.libraryonline.bookservice.model

import org.hibernate.annotations.GenericGenerator
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "books")
data class Book @JvmOverloads constructor(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String? = "",
        val title: String,
        val bookYear: Int,
        val author: String,
        val pressName: String,
        val isbn: String
)
