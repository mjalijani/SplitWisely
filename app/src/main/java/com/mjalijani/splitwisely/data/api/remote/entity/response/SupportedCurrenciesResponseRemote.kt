package com.mjalijani.splitwisely.data.api.remote.entity.response


import com.google.gson.annotations.SerializedName

data class SupportedCurrenciesResponseRemote(
    @SerializedName("currencies")
    val currencies: List<Currency>
)