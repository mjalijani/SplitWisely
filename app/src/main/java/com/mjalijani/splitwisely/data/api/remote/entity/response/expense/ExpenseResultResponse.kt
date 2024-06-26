package com.mjalijani.splitwisely.data.api.remote.entity.response.expense

import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.Errors

data class ExpenseResultResponse(
    @SerializedName("expenses")
    val expenses: List<Expense>,
    @SerializedName("errors")
    val errors: Errors
)
