package com.mjalijani.splitwisely.data.api.remote.response


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.response.user.User

data class ResultResponseRemote(
    @SerializedName("errors")
    val errors: Errors,
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("user")
    val user: User?
)