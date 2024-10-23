package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.group.CreateGroupParam
import com.mjalijani.splitwisely.domain.entity.group.Group
import com.mjalijani.splitwisely.utils.ResultState

interface GroupsRepository {

    suspend fun getCurrentUserGroups(): ResultState<List<Group>>

    suspend fun getGroupInfo(id: String): ResultState<Group>

    suspend fun createGroup(createGroupParam: CreateGroupParam): ResultState<Group>

    suspend fun deleteGroup(id: String): ResultState<Unit>

    suspend fun undeleteGroup(id: String): ResultState<Unit>

    suspend fun addUserToGroup(userId: String, groupId: String): ResultState<Unit>

    suspend fun removeUserFromGroup(userId: String, groupId: String): ResultState<Unit>

}