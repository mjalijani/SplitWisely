package com.mjalijani.splitwisely.ui.activity

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel


@HiltViewModel
class ActivityViewModel : ViewModel() {
    init {
        getActivities()
    }

    private fun getActivities() {

    }

    private fun getDetail(){}
}