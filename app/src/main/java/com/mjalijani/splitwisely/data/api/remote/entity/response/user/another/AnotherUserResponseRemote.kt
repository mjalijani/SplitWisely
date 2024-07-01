package com.mjalijani.splitwisely.data.api.remote.entity.response.user.another


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.UserDto

data class AnotherUserResponseRemote(
    @SerializedName("user")
    val user: UserDto
)