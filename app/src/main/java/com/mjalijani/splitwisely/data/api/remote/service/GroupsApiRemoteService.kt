package com.mjalijani.splitwisely.data.api.remote.service

import com.mjalijani.splitwisely.data.api.remote.entity.request.group.AddUserRequestRemote
import com.mjalijani.splitwisely.data.api.remote.entity.request.group.CreateGroupRequestRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.ResultResponseRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.group.CreateGroupResponseRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.group.CurrentUserGroupsResponseRemote
import com.mjalijani.splitwisely.data.api.remote.entity.response.group.GroupInfoResponseRemote
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface GroupsApiRemoteService {

    @GET("get_groups")
    suspend fun getCurrentUserGroups(): Response<CurrentUserGroupsResponseRemote>

    @GET("get_group/{id}")
    suspend fun getGroupInfo(@Path("id") id: String): Response<GroupInfoResponseRemote>

    @POST("create_group")
    suspend fun createGroup(@Body createGroupRequestRemote: CreateGroupRequestRemote): Response<CreateGroupResponseRemote>

    @POST("delete_group/{id}")
    suspend fun deleteGroup(@Path("id") id: String): Response<ResultResponseRemote>

    @POST("undelete_group/{id}")
    suspend fun undeleteGroup(@Path("id") id: String): Response<ResultResponseRemote>

    @POST("add_user_to_group")
    suspend fun addUserToGroup(@Body addUserRequestRemote: AddUserRequestRemote): Response<ResultResponseRemote>

    @POST("remove_user_from_group")
    suspend fun removeUserFromGroup(@Body addUserRequestRemote: AddUserRequestRemote): Response<ResultResponseRemote>


}