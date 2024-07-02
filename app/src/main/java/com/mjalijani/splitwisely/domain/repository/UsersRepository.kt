package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.user.User
import com.mjalijani.splitwisely.utils.ResultState

interface UsersRepository {

    suspend fun getCurrentUser(): ResultState<User>
    suspend fun getOtherUser(): ResultState<User>
    suspend fun updateUser(): ResultState<User>

}
