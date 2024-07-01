package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class SupportedCategoriesResponseRemote(
    @SerializedName("categories")
    val categories: List<CategoryDto>
)