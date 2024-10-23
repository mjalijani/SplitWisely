package com.mjalijani.splitwisely.domain.usecase.user

import com.mjalijani.splitwisely.domain.repository.UsersRepository
import javax.inject.Inject

class GetCurrentUserUseCase @Inject constructor(
    private val usersRepository: UsersRepository
) {

    suspend operator fun invoke() = usersRepository.getCurrentUser()

}