package com.mjalijani.splitwisely.data.api.remote.entity.response.friend


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.group.BalanceDto
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.PictureDto

data class FriendDto(
    @SerializedName("balance")
    val balance: List<BalanceDto>,
    @SerializedName("custom_picture")
    val customPicture: Boolean,
    @SerializedName("email")
    val email: String,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("groups")
    val groups: List<GroupDto>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("last_name")
    val lastName: String,
    @SerializedName("picture")
    val picture: PictureDto,
    @SerializedName("registration_status")
    val registrationStatus: String,
    @SerializedName("updated_at")
    val updatedAt: String
)