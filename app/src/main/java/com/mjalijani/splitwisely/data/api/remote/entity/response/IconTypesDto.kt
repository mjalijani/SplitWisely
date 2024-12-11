package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.domain.entity.category.IconType

data class IconTypesDto(
    @SerializedName("slim")
    val slimDto: SlimDto,
    @SerializedName("square")
    val squareDto: SquareDto
) {
    fun toDomainModel(): IconType = IconType(
        slim = slimDto.toDomainModel(),
        square = squareDto.toDomainModel()
    )
}
