package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class IconTypesDto(
    @SerializedName("slim")
    val slimDto: SlimDto,
    @SerializedName("square")
    val squareDto: SquareDto
)