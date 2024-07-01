package com.mjalijani.splitwisely.data.api.remote.entity.request.group


import com.google.gson.annotations.SerializedName

data class CreateGroupRequestRemote(
    @SerializedName("group_type")
    val groupType: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("users__0__email")
    val users0Email: String,
    @SerializedName("users__0__first_name")
    val users0FirstName: String,
    @SerializedName("users__0__last_name")
    val users0LastName: String,
    @SerializedName("users__1__id")
    val users1Id: Int
)