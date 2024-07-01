package com.mjalijani.splitwisely.data.api.remote.response.notification


import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("id")
    val id: Int,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)