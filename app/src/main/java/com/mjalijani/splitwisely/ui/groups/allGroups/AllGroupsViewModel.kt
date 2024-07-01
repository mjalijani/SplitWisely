package com.mjalijani.splitwisely.ui.groups.allGroups

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AllGroupsViewModel @Inject constructor() : ViewModel() {

    init {
        getGroups()
    }

    private fun getGroups() {}
    fun filterGroup() {}
    fun createGroup() {}
}