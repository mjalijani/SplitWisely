package com.mjalijani.splitwisely.ui.groups.allGroups

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class AllGroupsViewModel : ViewModel() {

    init {
        getGroups()
    }

    private fun getGroups() {}
    fun filterGroup() {}
    fun createGroup() {}
}