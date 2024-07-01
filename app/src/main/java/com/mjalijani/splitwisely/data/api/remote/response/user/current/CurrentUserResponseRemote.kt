package com.mjalijani.splitwisely.data.api.remote.response.user.current


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.response.user.User

data class CurrentUserResponseRemote(
    @SerializedName("user")
    val user: User
)