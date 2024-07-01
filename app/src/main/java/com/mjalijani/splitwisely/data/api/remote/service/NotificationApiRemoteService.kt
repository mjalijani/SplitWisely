package com.mjalijani.splitwisely.data.api.remote.service

import com.mjalijani.splitwisely.data.api.remote.entity.response.notification.NotificationsResponseRemote
import retrofit2.Response
import retrofit2.http.GET

interface NotificationApiRemoteService {

    @GET("get_notifications")
    suspend fun getNotifications(): Response<NotificationsResponseRemote>

}