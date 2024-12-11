package com.mjalijani.splitwisely.domain.entity.user

import com.mjalijani.splitwisely.data.api.remote.entity.response.user.NotificationsDto
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.PictureDto
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.UserDto

data class User(
    val customPicture: Boolean,
    val defaultCurrency: String,
    val email: String,
    val firstName: String,
    val id: Int,
    val lastName: String,
    val locale: String,
    val notifications: NotificationsDto,
    val notificationsCount: Int,
    val notificationsRead: String,
    val picture: PictureDto,
    val registrationStatus: String,
    val netBalance: String,
    val owedShare: String,
    val paidShare: String,
    val user: String,//UserDto, // what?
    val userId: Int?
)
