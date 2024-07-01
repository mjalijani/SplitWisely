package com.mjalijani.splitwisely.data.api.remote.request.friend


import com.google.gson.annotations.SerializedName

data class AddFriendRequestRemote(
    @SerializedName("user_email")
    val userEmail: String,
    @SerializedName("user_first_name")
    val userFirstName: String,
    @SerializedName("user_last_name")
    val userLastName: String
)