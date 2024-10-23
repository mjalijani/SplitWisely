package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.user.UpdateUser
import com.mjalijani.splitwisely.domain.entity.user.User
import com.mjalijani.splitwisely.utils.ResultState

interface UsersRepository {

    suspend fun getCurrentUser(): ResultState<User>
    suspend fun getOtherUser(userId : String): ResultState<User>
    suspend fun updateUser(updateUser: UpdateUser): ResultState<User>

}
