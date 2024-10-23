package com.mjalijani.splitwisely.data.api.remote.entity.response.comment


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.UserDto

data class CommentDto(
    @SerializedName("comment_type")
    val commentType: String,
    @SerializedName("content")
    val content: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("deleted_at")
    val deletedAt: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("relation_id")
    val relationId: Int,
    @SerializedName("relation_type")
    val relationType: String,
    @SerializedName("user")
    val user: UserDto
)