package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("icon")
    val icon: String,
    @SerializedName("icon_types")
    val iconTypes: IconTypes,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("subcategories")
    val subcategories: List<Subcategory>
)