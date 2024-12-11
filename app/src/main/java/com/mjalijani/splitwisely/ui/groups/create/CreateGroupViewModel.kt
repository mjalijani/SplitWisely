package com.mjalijani.splitwisely.ui.groups.create

import androidx.lifecycle.ViewModel
import com.mjalijani.splitwisely.domain.usecase.group.CreateGroupUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CreateGroupViewModel @Inject constructor(
    private val createGroupUseCase: CreateGroupUseCase
) : ViewModel() {
    fun createGroup(){}
}