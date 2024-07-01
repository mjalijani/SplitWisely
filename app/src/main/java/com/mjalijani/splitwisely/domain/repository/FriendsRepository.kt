package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.friend.Friend

interface FriendsRepository {

    suspend fun getFriends(): List<Friend>

    suspend fun getFriendInfo(id: String): Friend

    suspend fun createFriend(firstName: String, lastName: String, email: String): Friend

    suspend fun deleteFriend(id: String): Unit

}