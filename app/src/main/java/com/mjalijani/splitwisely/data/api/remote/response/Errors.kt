package com.mjalijani.splitwisely.data.api.remote.response


import com.google.gson.annotations.SerializedName

data class Errors(
    @SerializedName("base")
    val base: List<String>
)