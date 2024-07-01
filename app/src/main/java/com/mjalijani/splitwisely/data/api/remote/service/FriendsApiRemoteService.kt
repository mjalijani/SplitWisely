package com.mjalijani.splitwisely.data.api.remote.service

import com.mjalijani.splitwisely.data.api.remote.entity.request.friend.AddFriendRequestRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.ResultResponseRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.friend.CurrentUserFriendsResponseRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.friend.FriendInfoResponseRemote
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface FriendsApiRemoteService {

    @GET("get_friends")
    suspend fun getFriends(): Response<CurrentUserFriendsResponseRemote>

    @GET("get_friends/{id}")
    suspend fun getFriendInfo(@Path("id") id: String): Response<FriendInfoResponseRemote>

    @POST("create_friend")
    suspend fun createFriend(@Body addFriendRequestRemote: AddFriendRequestRemote): Response<FriendInfoResponseRemote>

    @POST("delete_friend/{id}")
    suspend fun deleteFriend(@Path("id") id: String): Response<ResultResponseRemote>

}