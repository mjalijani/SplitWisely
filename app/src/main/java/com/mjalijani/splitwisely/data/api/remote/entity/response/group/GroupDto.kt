package com.mjalijani.splitwisely.data.api.remote.entity.response.group


import com.google.gson.annotations.SerializedName

data class GroupDto(
    @SerializedName("avatar")
    val avatar: AvatarDto,
    @SerializedName("cover_photo")
    val coverPhoto: CoverPhotoDto,
    @SerializedName("custom_avatar")
    val customAvatar: Boolean,
    @SerializedName("group_type")
    val groupType: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("invite_link")
    val inviteLink: String,
    @SerializedName("members")
    val members: List<MemberDto>,
    @SerializedName("name")
    val name: String,
    @SerializedName("original_debts")
    val originalDebts: List<OriginalDebtDto>,
    @SerializedName("simplified_debts")
    val simplifiedDebts: List<SimplifiedDebtDto>,
    @SerializedName("simplify_by_default")
    val simplifyByDefault: Boolean,
    @SerializedName("updated_at")
    val updatedAt: String
)