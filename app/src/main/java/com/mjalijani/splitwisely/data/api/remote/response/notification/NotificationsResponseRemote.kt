package com.mjalijani.splitwisely.data.api.remote.response.notification


import com.google.gson.annotations.SerializedName

data class NotificationsResponseRemote(
    @SerializedName("notifications")
    val notifications: List<Notification>
)