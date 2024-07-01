package com.mjalijani.splitwisely.data.api.remote.entity.response.friend


import com.google.gson.annotations.SerializedName

data class Group(
    @SerializedName("balance")
    val balance: List<Balance>,
    @SerializedName("group_id")
    val groupId: Int
)