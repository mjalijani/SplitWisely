package com.mjalijani.splitwisely.domain.entity.friend

import com.mjalijani.splitwisely.data.api.remote.entity.response.friend.GroupDto
import com.mjalijani.splitwisely.data.api.remote.entity.response.group.BalanceDto
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.PictureDto
import com.mjalijani.splitwisely.domain.entity.group.Group

data class Friend(
    val balance: List<BalanceDto>,
    val customPicture: Boolean,
    val email: String,
    val firstName: String,
    val groups: List<Group>,
    val id: Int,
    val lastName: String,
    val picture: PictureDto,
    val registrationStatus: String,
    val updatedAt: String
)
