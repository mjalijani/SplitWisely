package com.mjalijani.splitwisely.domain.usecase.user

import com.mjalijani.splitwisely.domain.repository.UsersRepository
import javax.inject.Inject

class GetOtherUserUseCase @Inject constructor(
    private val usersRepository: UsersRepository
) {

    suspend operator fun invoke(userId : String) = usersRepository.getOtherUser(userId)

}