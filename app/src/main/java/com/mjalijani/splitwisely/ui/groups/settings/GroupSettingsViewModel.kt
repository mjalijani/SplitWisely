package com.mjalijani.splitwisely.ui.groups.settings

import androidx.lifecycle.ViewModel
import com.mjalijani.splitwisely.domain.usecase.friend.GetFriendsUseCase
import com.mjalijani.splitwisely.domain.usecase.group.AddUserToGroupUseCase
import com.mjalijani.splitwisely.domain.usecase.group.DeleteGroupUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class GroupSettingsViewModel @Inject constructor(
    private val deleteGroupUseCase: DeleteGroupUseCase,
    private val addUserToGroupUseCase: AddUserToGroupUseCase,
    private val getFriendsUseCase: GetFriendsUseCase,
) : ViewModel() {
    fun editGroup() {}
    fun addPeople() {}
    fun fetchFriends() {}
    fun inviteByLink() {}
    fun deleteGroup() {}
}