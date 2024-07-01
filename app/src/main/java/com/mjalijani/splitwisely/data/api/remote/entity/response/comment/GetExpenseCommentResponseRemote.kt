package com.mjalijani.splitwisely.data.api.remote.entity.response.comment


import com.google.gson.annotations.SerializedName

data class GetExpenseCommentResponseRemote(
    @SerializedName("comments")
    val comments: List<Comment>
)