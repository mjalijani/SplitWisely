package com.mjalijani.splitwisely.ui.activity.detail

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ActivityDetailViewModel @Inject constructor() : ViewModel() {
    init {
        getActivityDetail()
        getActivityComments()
    }

    private fun getActivityDetail() {

    }

    private fun getActivityComments() {}

    fun editActivity() {

    }

    fun deleteActivity() {}

    fun addComment() {}
}