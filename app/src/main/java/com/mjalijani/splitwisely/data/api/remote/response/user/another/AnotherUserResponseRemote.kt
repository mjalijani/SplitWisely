package com.mjalijani.splitwisely.data.api.remote.response.user.another


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.response.user.User

data class AnotherUserResponseRemote(
    @SerializedName("user")
    val user: User
)