package com.mjalijani.splitwisely.data.api.remote.entity.request.comment


import com.google.gson.annotations.SerializedName

data class CreateCommentRequestRemote(
    @SerializedName("content")
    val content: String,
    @SerializedName("expense_id")
    val expenseId: Int
)