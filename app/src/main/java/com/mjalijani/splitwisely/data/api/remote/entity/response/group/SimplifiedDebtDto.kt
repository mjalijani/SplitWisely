package com.mjalijani.splitwisely.data.api.remote.entity.response.group


import com.google.gson.annotations.SerializedName

data class SimplifiedDebtDto(
    @SerializedName("amount")
    val amount: String,
    @SerializedName("currency_code")
    val currencyCode: String,
    @SerializedName("from")
    val from: Int,
    @SerializedName("to")
    val to: Int
)