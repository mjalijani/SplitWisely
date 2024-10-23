package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.domain.entity.category.Square

data class SquareDto(
    @SerializedName("large")
    val large: String,
    @SerializedName("xlarge")
    val xlarge: String
) {
    fun toDomainModel(): Square = Square(
        large = large,
        xlarge = xlarge
    )
}