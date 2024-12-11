package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.comment.Comment
import com.mjalijani.splitwisely.domain.entity.comment.CreateComment
import com.mjalijani.splitwisely.utils.ResultState

interface CommentRepository {

    suspend fun getComments(): ResultState<List<Comment>>

    suspend fun createComment(createComment: CreateComment): ResultState<List<Comment>>

    suspend fun deleteComment(id: String): ResultState<List<Comment>>


}