package com.mjalijani.splitwisely.data.api.remote.response.comment


import com.google.gson.annotations.SerializedName

data class GetExpenseCommentResponseRemote(
    @SerializedName("comments")
    val comments: List<Comment>
)