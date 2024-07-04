package com.mjalijani.splitwisely.domain.usecase.friend

import com.mjalijani.splitwisely.domain.repository.FriendsRepository
import javax.inject.Inject

class CreateFriendUseCase @Inject constructor(
    private val friendsRepository: FriendsRepository
) {

    suspend operator fun invoke(firstName: String, lastName: String, email: String) =
        friendsRepository.createFriend(firstName = firstName, lastName = lastName, email = email)

}