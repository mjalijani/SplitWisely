package com.mjalijani.splitwisely.ui.activity

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ActivityViewModel @Inject constructor() : ViewModel() {
    init {
        getActivities()
    }

    private fun getActivities() {

    }

    private fun getDetail(){}
}