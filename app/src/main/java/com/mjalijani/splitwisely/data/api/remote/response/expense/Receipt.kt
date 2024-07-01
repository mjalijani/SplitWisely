package com.mjalijani.splitwisely.data.api.remote.response.expense


import com.google.gson.annotations.SerializedName

data class Receipt(
    @SerializedName("large")
    val large: String,
    @SerializedName("original")
    val original: String
)