package com.mjalijani.splitwisely.data.api.remote.entity.response.notification


import com.google.gson.annotations.SerializedName

data class NotificationsResponseRemote(
    @SerializedName("notifications")
    val notifications: List<Notification>
)