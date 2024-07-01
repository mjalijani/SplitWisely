package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.user.User

interface UsersRepository {

    suspend fun getCurrentUser() : User
    suspend fun getOtherUser() : User
    suspend fun updateUser() : User

}
