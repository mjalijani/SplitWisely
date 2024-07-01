package com.mjalijani.splitwisely.data.api.remote.request.group


import com.google.gson.annotations.SerializedName

data class AddUserRequestRemote(
    @SerializedName("group_id")
    val groupId: Int,
    @SerializedName("user_id")
    val userId: Int
)