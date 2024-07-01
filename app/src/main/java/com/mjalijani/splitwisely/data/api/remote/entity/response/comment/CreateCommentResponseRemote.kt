package com.mjalijani.splitwisely.data.api.remote.entity.response.comment

import com.google.gson.annotations.SerializedName

data class CreateCommentResponseRemote(
    @SerializedName("comments")
    val comments: List<Comment>
)