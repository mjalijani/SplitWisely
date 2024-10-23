package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.utils.callAdapter.BaseNetworkResponse

data class SupportedCategoriesResponseRemote(
    @SerializedName("categories")
    val categories: List<CategoryDto>
) : BaseNetworkResponse()