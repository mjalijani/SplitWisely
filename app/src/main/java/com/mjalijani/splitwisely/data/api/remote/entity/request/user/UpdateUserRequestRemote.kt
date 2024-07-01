package com.mjalijani.splitwisely.data.api.remote.entity.request.user


import com.google.gson.annotations.SerializedName

data class UpdateUserRequestRemote(
    @SerializedName("default_currency")
    val defaultCurrency: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("last_name")
    val lastName: String,
    @SerializedName("locale")
    val locale: String,
    @SerializedName("password")
    val password: String
)