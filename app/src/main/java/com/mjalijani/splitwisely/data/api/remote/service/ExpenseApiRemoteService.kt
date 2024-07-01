package com.mjalijani.splitwisely.data.api.remote.service

import com.mjalijani.splitwisely.data.api.remote.entity.request.expense.CreateAnExpenseRequestRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.expense.CurrentUserExpensesResponseRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.expense.ExpenseInfoResponseRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.expense.ExpenseResultResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ExpenseApiRemoteService {

    @GET("get_expenses")
    suspend fun getCurrentUserExpenses(): Response<CurrentUserExpensesResponseRemote>

    @GET("get_expense/{id}")
    suspend fun getAnotherUser(@Path("id") id: String): Response<ExpenseInfoResponseRemote>

    @POST("create_expense")
    suspend fun createExpense(@Body createAnExpenseRequestRemote: CreateAnExpenseRequestRemote): Response<ExpenseResultResponse>

    @POST("update_expense/{id}")
    suspend fun updateExpense(
        @Path("id") id: String,
        @Body createAnExpenseRequestRemote: CreateAnExpenseRequestRemote
    ): Response<ExpenseResultResponse>

    @POST("delete_expense/{id}")
    suspend fun deleteExpense(@Path("id") id: String): Response<ExpenseResultResponse>

    @POST("undelete_expense/{id}")
    suspend fun undeleteExpense(@Path("id") id: String): Response<ExpenseResultResponse>

}