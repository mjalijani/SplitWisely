package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.comment.Comment
import com.mjalijani.splitwisely.domain.entity.comment.CreateComment

interface CommentRepository {

    suspend fun getComments(): List<Comment>

    suspend fun createComment(createComment: CreateComment): List<Comment>

    suspend fun deleteComment(id: String): List<Comment>


}