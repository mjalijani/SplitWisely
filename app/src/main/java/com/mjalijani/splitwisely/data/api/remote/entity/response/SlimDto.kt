package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class SlimDto(
    @SerializedName("large")
    val large: String,
    @SerializedName("small")
    val small: String
)