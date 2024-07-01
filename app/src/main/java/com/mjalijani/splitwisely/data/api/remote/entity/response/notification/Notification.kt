package com.mjalijani.splitwisely.data.api.remote.entity.response.notification


import com.google.gson.annotations.SerializedName

data class Notification(
    @SerializedName("content")
    val content: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("created_by")
    val createdBy: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image_shape")
    val imageShape: String,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("source")
    val source: Source,
    @SerializedName("type")
    val type: Int
)