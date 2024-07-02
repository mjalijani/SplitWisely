package com.mjalijani.splitwisely.domain.usecase.friend

import com.mjalijani.splitwisely.domain.repository.FriendsRepository
import javax.inject.Inject

class GetFriendInfoUseCase @Inject constructor(
    private val friendsRepository: FriendsRepository
) {

    suspend operator fun invoke(id: String) = friendsRepository.getFriendInfo(id)

}