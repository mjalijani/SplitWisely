package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.domain.entity.category.Slim

data class SlimDto(
    @SerializedName("large")
    val large: String,
    @SerializedName("small")
    val small: String
) {
    fun toDomainModel(): Slim = Slim(
        large = large,
        small = small
    )
}