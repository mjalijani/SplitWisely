package com.mjalijani.splitwisely.domain.usecase.group

import com.mjalijani.splitwisely.domain.repository.GroupsRepository
import javax.inject.Inject

class GetCurrentUserGroupUseCase @Inject constructor(
    private val groupsRepository: GroupsRepository
) {

    suspend operator fun invoke() = groupsRepository.getCurrentUserGroups()

}