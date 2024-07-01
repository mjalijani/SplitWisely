package com.mjalijani.splitwisely.data.api.remote.response.friend


import com.google.gson.annotations.SerializedName

data class Balance(
    @SerializedName("amount")
    val amount: String,
    @SerializedName("currency_code")
    val currencyCode: String
)