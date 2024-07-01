package com.mjalijani.splitwisely.data.api.remote.response


import com.google.gson.annotations.SerializedName

data class Subcategory(
    @SerializedName("icon")
    val icon: String,
    @SerializedName("icon_types")
    val iconTypes: IconTypes,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)