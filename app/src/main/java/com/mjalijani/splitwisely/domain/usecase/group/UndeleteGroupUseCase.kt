package com.mjalijani.splitwisely.domain.usecase.group

import com.mjalijani.splitwisely.domain.repository.GroupsRepository
import javax.inject.Inject

class UndeleteGroupUseCase @Inject constructor(
    private val groupsRepository: GroupsRepository
) {

    suspend operator fun invoke(groupId: String) = groupsRepository.undeleteGroup(groupId)

}