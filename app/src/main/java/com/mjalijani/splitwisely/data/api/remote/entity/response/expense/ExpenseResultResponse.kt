package com.mjalijani.splitwisely.data.api.remote.entity.response.expense

import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.ErrorsDto

data class ExpenseResultResponse(
    @SerializedName("expenses")
    val expenses: List<ExpenseDto>,
    @SerializedName("errors")
    val errors: ErrorsDto
)
