package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.friend.Friend
import com.mjalijani.splitwisely.utils.ResultState

interface FriendsRepository {

    suspend fun getFriends(): ResultState<List<Friend>>

    suspend fun getFriendInfo(id: String): ResultState<Friend>

    suspend fun createFriend(firstName: String, lastName: String, email: String): ResultState<Friend>

    suspend fun deleteFriend(id: String): ResultState<Unit>

}