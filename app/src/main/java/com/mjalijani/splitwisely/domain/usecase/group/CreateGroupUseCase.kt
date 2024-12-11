package com.mjalijani.splitwisely.domain.usecase.group

import com.mjalijani.splitwisely.domain.entity.group.CreateGroupParam
import com.mjalijani.splitwisely.domain.repository.GroupsRepository
import javax.inject.Inject

class CreateGroupUseCase @Inject constructor(
    private val groupsRepository: GroupsRepository
) {

    suspend operator fun invoke(createGroupParam: CreateGroupParam) =
        groupsRepository.createGroup(createGroupParam)

}