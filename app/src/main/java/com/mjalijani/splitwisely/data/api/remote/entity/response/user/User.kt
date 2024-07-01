package com.mjalijani.splitwisely.data.api.remote.entity.response.user


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("custom_picture")
    val customPicture: Boolean?,
    @SerializedName("default_currency")
    val defaultCurrency: String?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("first_name")
    val firstName: String?,
    @SerializedName("id")
    val id: Int,
    @SerializedName("last_name")
    val lastName: String?,
    @SerializedName("locale")
    val locale: String?,
    @SerializedName("notifications")
    val notifications: Notifications?,
    @SerializedName("notifications_count")
    val notificationsCount: Int?,
    @SerializedName("notifications_read")
    val notificationsRead: String?,
    @SerializedName("picture")
    val picture: Picture?,
    @SerializedName("registration_status")
    val registrationStatus: String?,
    @SerializedName("net_balance")
    val netBalance: String?,
    @SerializedName("owed_share")
    val owedShare: String?,
    @SerializedName("paid_share")
    val paidShare: String?,
    @SerializedName("user")
    val user: User?,
    @SerializedName("user_id")
    val userId: Int?
)