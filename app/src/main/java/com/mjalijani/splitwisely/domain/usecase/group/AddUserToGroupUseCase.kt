package com.mjalijani.splitwisely.domain.usecase.group

import com.mjalijani.splitwisely.domain.repository.GroupsRepository
import javax.inject.Inject

class AddUserToGroupUseCase @Inject constructor(
    private val groupsRepository: GroupsRepository
) {

    suspend operator fun invoke(userId: String, groupId: String) =
        groupsRepository.addUserToGroup(userId = userId, groupId = groupId)

}