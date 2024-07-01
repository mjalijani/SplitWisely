package com.mjalijani.splitwisely.data.api.remote.entity.response.friend


import com.google.gson.annotations.SerializedName

data class FriendInfoResponseRemote(
    @SerializedName("friend")
    val friend: Friend
)