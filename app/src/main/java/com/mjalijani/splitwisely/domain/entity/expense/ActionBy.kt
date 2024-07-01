package com.mjalijani.splitwisely.domain.entity.expense

import com.mjalijani.splitwisely.data.api.remote.entity.response.user.PictureDto

data class ActionBy(
    val customPicture: Boolean,
    val email: String,
    val firstName: String,
    val id: Int,
    val lastName: String,
    val picture: PictureDto,
    val registrationStatus: String
)
