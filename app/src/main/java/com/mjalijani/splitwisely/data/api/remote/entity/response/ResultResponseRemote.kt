package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.User

data class ResultResponseRemote(
    @SerializedName("errors")
    val errors: Errors,
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("user")
    val user: User?
)