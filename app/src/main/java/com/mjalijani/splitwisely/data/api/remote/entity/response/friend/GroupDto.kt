package com.mjalijani.splitwisely.data.api.remote.entity.response.friend


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.entity.response.group.BalanceDto

data class GroupDto(
    @SerializedName("balance")
    val balance: List<BalanceDto>,
    @SerializedName("group_id")
    val groupId: Int
)