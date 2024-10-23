package com.mjalijani.splitwisely.ui.groups.allGroups

import androidx.lifecycle.ViewModel
import com.mjalijani.splitwisely.domain.usecase.group.CreateGroupUseCase
import com.mjalijani.splitwisely.domain.usecase.group.GetGroupUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AllGroupsViewModel @Inject constructor(
    private val getGroupUseCase: GetGroupUseCase,
    private val createGroupUseCase: CreateGroupUseCase
) : ViewModel() {

    init {
        getGroups()
    }

    private fun getGroups() {}
    fun filterGroup() {}
    fun createGroup() {}
}