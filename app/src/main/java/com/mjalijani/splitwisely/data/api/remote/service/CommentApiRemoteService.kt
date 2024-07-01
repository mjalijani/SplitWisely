package com.mjalijani.splitwisely.data.api.remote.service

import com.mjalijani.splitwisely.data.api.remote.entity.response.comment.CreateCommentResponseRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.comment.GetExpenseCommentResponseRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.expense.CreateAnExpenseRequestRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.expense.ExpenseResultResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CommentApiRemoteService {

    @GET("get_comments")
    suspend fun getComments(): Response<GetExpenseCommentResponseRemote>

    @POST("create_comment")
    suspend fun createExpense(@Body createCommentExpenseRequestRemote: CreateAnExpenseRequestRemote): Response<CreateCommentResponseRemote>

    @POST("delete_comment/{id}")
    suspend fun deleteComment(@Path("id") id: String): Response<ExpenseResultResponse>

}