package com.mjalijani.splitwisely.domain.usecase.friend

import com.mjalijani.splitwisely.domain.repository.FriendsRepository
import javax.inject.Inject

class DeleteFriendUseCase @Inject constructor(
    private val friendsRepository: FriendsRepository
) {

    suspend operator fun invoke(id: String) = friendsRepository.deleteFriend(id)

}