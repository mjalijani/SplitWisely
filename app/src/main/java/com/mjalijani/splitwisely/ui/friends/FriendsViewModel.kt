package com.mjalijani.splitwisely.ui.friends

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel


@HiltViewModel
class FriendsViewModel : ViewModel() {
    init {
        getFriends()
    }

    private fun getFriends() {}
    fun filterFriends() {}
    fun addFriend() {}

}