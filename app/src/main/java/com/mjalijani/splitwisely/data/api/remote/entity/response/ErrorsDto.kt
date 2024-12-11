package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class ErrorsDto(
    @SerializedName("base")
    val base: List<String>
)