package com.mjalijani.splitwisely.data.api.remote.entity.response.user.current


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.UserDto

data class CurrentUserResponseRemote(
    @SerializedName("user")
    val user: UserDto
)