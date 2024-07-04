package com.mjalijani.splitwisely.domain.entity.group

data class CreateGroupParam(
    val type: String,
    val name: String,
    val userEmail: String,
    val firstName: String,
    val lastName: String,
    val userId: String
)