package com.mjalijani.splitwisely.data.api.remote.response.expense


import com.google.gson.annotations.SerializedName

data class Repayment(
    @SerializedName("amount")
    val amount: String,
    @SerializedName("from")
    val from: Int,
    @SerializedName("to")
    val to: Int
)