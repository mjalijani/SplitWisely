package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class CurrencyDto(
    @SerializedName("currency_code")
    val currencyCode: String,
    @SerializedName("unit")
    val unit: String
)