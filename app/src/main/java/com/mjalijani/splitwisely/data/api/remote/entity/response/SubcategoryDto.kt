package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.domain.entity.category.Subcategory

data class SubcategoryDto(
    @SerializedName("icon")
    val icon: String,
    @SerializedName("icon_types")
    val iconTypes: IconTypesDto,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
) {
    fun toDomainModel() : Subcategory = Subcategory(
        icon = icon,
        iconTypes = iconTypes.toDomainModel(),
        id = id,
        name  = name
    )
}