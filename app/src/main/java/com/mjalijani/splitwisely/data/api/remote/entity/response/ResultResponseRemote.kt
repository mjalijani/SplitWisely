package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.UserDto

data class ResultResponseRemote(
    @SerializedName("errors")
    val errors: ErrorsDto,
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("user")
    val userDto: UserDto?
)