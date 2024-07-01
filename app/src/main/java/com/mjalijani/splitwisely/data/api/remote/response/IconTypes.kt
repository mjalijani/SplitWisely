package com.mjalijani.splitwisely.data.api.remote.response


import com.google.gson.annotations.SerializedName

data class IconTypes(
    @SerializedName("slim")
    val slim: Slim,
    @SerializedName("square")
    val square: Square
)