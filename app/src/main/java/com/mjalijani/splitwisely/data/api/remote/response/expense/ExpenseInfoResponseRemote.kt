package com.mjalijani.splitwisely.data.api.remote.response.expense


import com.google.gson.annotations.SerializedName

data class ExpenseInfoResponseRemote(
    @SerializedName("expense")
    val expense: Expense
)