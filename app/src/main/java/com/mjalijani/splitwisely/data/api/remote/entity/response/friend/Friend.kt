package com.mjalijani.splitwisely.data.api.remote.entity.response.friend


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.Picture

data class Friend(
    @SerializedName("balance")
    val balance: List<Balance>,
    @SerializedName("custom_picture")
    val customPicture: Boolean,
    @SerializedName("email")
    val email: String,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("groups")
    val groups: List<Group>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("last_name")
    val lastName: String,
    @SerializedName("picture")
    val picture: Picture,
    @SerializedName("registration_status")
    val registrationStatus: String,
    @SerializedName("updated_at")
    val updatedAt: String
)