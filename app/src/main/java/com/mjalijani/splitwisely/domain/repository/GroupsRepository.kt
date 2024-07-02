package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.group.Group
import com.mjalijani.splitwisely.utils.ResultState

interface GroupsRepository {
    // return models pending...

    suspend fun getCurrentUserGroups(): ResultState<List<Group>>

    suspend fun getGroupInfo(id: String): ResultState<Group>

    // will be updated later
    suspend fun createGroup(
        type: String,
        name: String,
        userEmail: String,
        firstName: String,
        lastName: String,
        userId: String
    ): ResultState<Group> // create model class like CreateGroupRequestRemote

    suspend fun deleteGroup(id: String): ResultState<Unit>

    suspend fun undeleteGroup(id: String): ResultState<Unit>

    suspend fun addUserToGroup(userId: String, groupId: String): ResultState<Unit>

    suspend fun removeUserFromGroup(userId: String, groupId: String): ResultState<Unit>

}