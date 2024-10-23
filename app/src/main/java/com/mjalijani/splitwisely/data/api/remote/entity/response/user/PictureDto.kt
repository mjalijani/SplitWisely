package com.mjalijani.splitwisely.data.api.remote.entity.response.user


import com.google.gson.annotations.SerializedName

data class PictureDto(
    @SerializedName("large")
    val large: String,
    @SerializedName("medium")
    val medium: String,
    @SerializedName("small")
    val small: String
)