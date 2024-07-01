package com.mjalijani.splitwisely.data.api.remote.entity.response.group


import com.google.gson.annotations.SerializedName

data class CurrentUserGroupsResponseRemote(
    @SerializedName("groups")
    val groupDtos: List<GroupDto>
)