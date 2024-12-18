package com.mjalijani.splitwisely.data.api.remote.entity.response.group


import com.google.gson.annotations.SerializedName

data class AvatarDto(
    @SerializedName("large")
    val large: String,
    @SerializedName("medium")
    val medium: String,
    @SerializedName("original")
    val original: Any?,
    @SerializedName("small")
    val small: String,
    @SerializedName("xlarge")
    val xlarge: String,
    @SerializedName("xxlarge")
    val xxlarge: String
)