package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class CategoryDto(
    @SerializedName("icon")
    val icon: String,
    @SerializedName("icon_types")
    val iconTypes: IconTypesDto,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("subcategories")
    val subcategories: List<SubcategoryDto>
)