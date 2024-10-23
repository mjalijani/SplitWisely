package com.mjalijani.splitwisely.domain.entity.comment

import com.mjalijani.splitwisely.domain.entity.user.User

data class Comment(
    val commentType: String,
    val content: String,
    val createdAt: String,
    val deletedAt: String,
    val id: Int,
    val relationId: Int,
    val relationType: String,
    val user: User
)
