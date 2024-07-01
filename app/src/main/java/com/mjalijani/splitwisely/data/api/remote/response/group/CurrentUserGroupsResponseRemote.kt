package com.mjalijani.splitwisely.data.api.remote.response.group


import com.google.gson.annotations.SerializedName

data class CurrentUserGroupsResponseRemote(
    @SerializedName("groups")
    val groups: List<Group>
)