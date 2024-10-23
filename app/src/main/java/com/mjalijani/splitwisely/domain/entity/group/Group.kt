package com.mjalijani.splitwisely.domain.entity.group

import com.mjalijani.splitwisely.data.api.remote.entity.response.group.MemberDto

data class Group(
    val avatar: GroupAvatar,
    val coverPhoto: GroupCoverPhoto,
    val customAvatar: Boolean,
    val groupType: String,
    val id: Int,
    val inviteLink: String,
    val members: List<MemberDto>,
    val name: String,
    val originalDebts: List<GroupOriginalDebt>,
    val simplifiedDebts: List<GroupSimplifiedDebt>,
    val simplifyByDefault: Boolean,
    val updatedAt: String
)