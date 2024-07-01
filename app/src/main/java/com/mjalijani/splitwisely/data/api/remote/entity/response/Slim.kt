package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class Slim(
    @SerializedName("large")
    val large: String,
    @SerializedName("small")
    val small: String
)