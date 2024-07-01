package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.group.Group

interface GroupsRepository {
    // return models pending...

    suspend fun getCurrentUserGroups(): List<Group>

    suspend fun getGroupInfo(id: String): Group

    // will be updated later
    suspend fun createGroup(
        type: String,
        name: String,
        userEmail: String,
        firstName: String,
        lastName: String,
        userId: String
    ): Group // create model class like CreateGroupRequestRemote

    suspend fun deleteGroup(id: String): Unit

    suspend fun undeleteGroup(id: String): Unit

    suspend fun addUserToGroup(userId: String, groupId: String): Unit

    suspend fun removeUserFromGroup(userId: String, groupId: String): Unit

}