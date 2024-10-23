package com.mjalijani.splitwisely.domain.usecase.user

import com.mjalijani.splitwisely.domain.entity.user.UpdateUser
import com.mjalijani.splitwisely.domain.repository.UsersRepository
import javax.inject.Inject

class UpdateUserUseCase @Inject constructor(
    private val usersRepository: UsersRepository
) {

    suspend operator fun invoke(updateUser: UpdateUser) = usersRepository.updateUser(updateUser)

}