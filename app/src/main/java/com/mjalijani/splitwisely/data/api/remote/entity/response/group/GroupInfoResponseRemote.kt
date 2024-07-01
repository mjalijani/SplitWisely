package com.mjalijani.splitwisely.data.api.remote.entity.response.group


import com.google.gson.annotations.SerializedName

data class GroupInfoResponseRemote(
    @SerializedName("group")
    val group: Group
)