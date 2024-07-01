package com.mjalijani.splitwisely.data.api.remote.entity.response.expense


import com.google.gson.annotations.SerializedName

data class CreateAnExpenseByEqualRequestRemote(
    @SerializedName("category_id")
    val categoryId: Int,
    @SerializedName("cost")
    val cost: String,
    @SerializedName("currency_code")
    val currencyCode: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("details")
    val details: String,
    @SerializedName("group_id")
    val groupId: Int,
    @SerializedName("repeat_interval")
    val repeatInterval: String,
    @SerializedName("split_equally")
    val splitEqually: Boolean
)