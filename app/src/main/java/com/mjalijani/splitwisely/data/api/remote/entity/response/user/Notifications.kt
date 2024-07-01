package com.mjalijani.splitwisely.data.api.remote.entity.response.user


import com.google.gson.annotations.SerializedName

data class Notifications(
    @SerializedName("added_as_friend")
    val addedAsFriend: Boolean
)