package com.mjalijani.splitwisely.ui.friends

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class FriendsViewModel @Inject constructor() : ViewModel() {
    init {
        getFriends()
    }

    private fun getFriends() {}
    fun filterFriends() {}
    fun addFriend() {}

}