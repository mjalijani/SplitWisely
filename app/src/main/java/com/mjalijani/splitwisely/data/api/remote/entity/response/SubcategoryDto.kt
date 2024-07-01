package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class SubcategoryDto(
    @SerializedName("icon")
    val icon: String,
    @SerializedName("icon_types")
    val iconTypes: IconTypesDto,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)