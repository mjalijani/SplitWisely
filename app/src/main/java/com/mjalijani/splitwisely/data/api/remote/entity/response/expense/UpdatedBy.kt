package com.mjalijani.splitwisely.data.api.remote.entity.response.expense


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.Picture

data class UpdatedBy(
    @SerializedName("custom_picture")
    val customPicture: Boolean,
    @SerializedName("email")
    val email: String,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("last_name")
    val lastName: String,
    @SerializedName("picture")
    val picture: Picture,
    @SerializedName("registration_status")
    val registrationStatus: String
)