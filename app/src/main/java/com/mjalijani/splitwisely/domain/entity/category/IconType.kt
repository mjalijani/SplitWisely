package com.mjalijani.splitwisely.domain.entity.category

import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.SlimDto
import com.mjalijani.splitwisely.data.api.remote.entity.response.SquareDto

data class IconType(
    val slim: Slim,
    val square: Square
)

data class Slim(
    val large: String,
    val small: String
)

data class Square(
    val large: String,
    val xlarge: String
)
