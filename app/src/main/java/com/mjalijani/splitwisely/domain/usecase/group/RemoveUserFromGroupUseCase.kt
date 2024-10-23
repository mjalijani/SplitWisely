package com.mjalijani.splitwisely.domain.usecase.group

import com.mjalijani.splitwisely.domain.repository.GroupsRepository
import javax.inject.Inject

class RemoveUserFromGroupUseCase @Inject constructor(
    private val groupsRepository: GroupsRepository
) {

    suspend operator fun invoke(groupId: String, userId: String) =
        groupsRepository.removeUserFromGroup(userId = userId, groupId = groupId)

}