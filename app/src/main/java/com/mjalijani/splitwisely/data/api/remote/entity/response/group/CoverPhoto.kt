package com.mjalijani.splitwisely.data.api.remote.entity.response.group


import com.google.gson.annotations.SerializedName

data class CoverPhoto(
    @SerializedName("xlarge")
    val xlarge: String,
    @SerializedName("xxlarge")
    val xxlarge: String
)