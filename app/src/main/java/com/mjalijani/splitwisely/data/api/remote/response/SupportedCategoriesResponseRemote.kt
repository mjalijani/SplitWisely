package com.mjalijani.splitwisely.data.api.remote.response


import com.google.gson.annotations.SerializedName

data class SupportedCategoriesResponseRemote(
    @SerializedName("categories")
    val categories: List<Category>
)