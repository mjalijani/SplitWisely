package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class Errors(
    @SerializedName("base")
    val base: List<String>
)