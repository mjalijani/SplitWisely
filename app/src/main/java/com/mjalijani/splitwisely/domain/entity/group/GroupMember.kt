package com.mjalijani.splitwisely.domain.entity.group

import com.mjalijani.splitwisely.domain.entity.Balance
import com.mjalijani.splitwisely.domain.entity.user.UserPicture

data class GroupMember(
    val balance: List<Balance>,
    val customPicture: Boolean,
    val email: String,
    val firstName: String,
    val id: Int,
    val lastName: String,
    val picture: UserPicture,
    val registrationStatus: String
)
