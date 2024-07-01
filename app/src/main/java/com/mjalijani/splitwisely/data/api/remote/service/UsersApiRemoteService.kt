package com.mjalijani.splitwisely.data.api.remote.service

import com.mjalijani.splitwisely.data.api.remote.entity.request.user.UpdateUserRequestRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.User
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.another.AnotherUserResponseRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.user.current.CurrentUserResponseRemote
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface UsersApiRemoteService {

    @GET("get_current_user")
    suspend fun getCurrentUser(): Response<CurrentUserResponseRemote>

    @GET("get_user/{id}")
    suspend fun getAnotherUser(@Path("id") id: String): Response<AnotherUserResponseRemote>

    @POST("update_user/{id}")
    suspend fun updateUser(@Body updateUserRequestRemote: UpdateUserRequestRemote): Response<User>

}