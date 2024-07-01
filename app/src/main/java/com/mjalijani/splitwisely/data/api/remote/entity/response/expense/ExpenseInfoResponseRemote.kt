package com.mjalijani.splitwisely.data.api.remote.entity.response.expense


import com.google.gson.annotations.SerializedName

data class ExpenseInfoResponseRemote(
    @SerializedName("expense")
    val expense: Expense
)