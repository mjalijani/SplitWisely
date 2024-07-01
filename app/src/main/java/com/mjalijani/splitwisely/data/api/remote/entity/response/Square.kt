package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class Square(
    @SerializedName("large")
    val large: String,
    @SerializedName("xlarge")
    val xlarge: String
)