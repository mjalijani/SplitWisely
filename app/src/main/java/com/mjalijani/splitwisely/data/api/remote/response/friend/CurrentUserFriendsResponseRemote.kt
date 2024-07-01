package com.mjalijani.splitwisely.data.api.remote.response.friend


import com.google.gson.annotations.SerializedName

data class CurrentUserFriendsResponseRemote(
    @SerializedName("friends")
    val friends: List<Friend>
)