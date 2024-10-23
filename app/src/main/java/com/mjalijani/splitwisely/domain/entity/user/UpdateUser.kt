package com.mjalijani.splitwisely.domain.entity.user

data class UpdateUser(
    val defaultCurrency: String,
    val email: String,
    val firstName: String,
    val lastName: String,
    val locale: String,
    val password: String
)
