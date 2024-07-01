package com.mjalijani.splitwisely.data.api.remote.response.comment

import com.google.gson.annotations.SerializedName

data class DeleteCommentResponseRemote(
    @SerializedName("comments")
    val comments: List<Comment>
)