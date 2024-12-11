package com.mjalijani.splitwisely.data.api.remote.entity.response.expense


import com.google.gson.annotations.SerializedName

data class RepaymentDto(
    @SerializedName("amount")
    val amount: String,
    @SerializedName("from")
    val from: Int,
    @SerializedName("to")
    val to: Int
)