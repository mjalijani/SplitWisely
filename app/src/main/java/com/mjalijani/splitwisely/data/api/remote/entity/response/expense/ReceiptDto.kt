package com.mjalijani.splitwisely.data.api.remote.entity.response.expense


import com.google.gson.annotations.SerializedName

data class ReceiptDto(
    @SerializedName("large")
    val large: String,
    @SerializedName("original")
    val original: String
)