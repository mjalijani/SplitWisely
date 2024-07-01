package com.mjalijani.splitwisely.data.api.remote.response.group


import com.google.gson.annotations.SerializedName

data class Group(
    @SerializedName("avatar")
    val avatar: Avatar,
    @SerializedName("cover_photo")
    val coverPhoto: CoverPhoto,
    @SerializedName("custom_avatar")
    val customAvatar: Boolean,
    @SerializedName("group_type")
    val groupType: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("invite_link")
    val inviteLink: String,
    @SerializedName("members")
    val members: List<Member>,
    @SerializedName("name")
    val name: String,
    @SerializedName("original_debts")
    val originalDebts: List<OriginalDebt>,
    @SerializedName("simplified_debts")
    val simplifiedDebts: List<SimplifiedDebt>,
    @SerializedName("simplify_by_default")
    val simplifyByDefault: Boolean,
    @SerializedName("updated_at")
    val updatedAt: String
)