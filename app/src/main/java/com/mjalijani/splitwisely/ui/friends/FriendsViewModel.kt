package com.mjalijani.splitwisely.ui.friends

import androidx.lifecycle.ViewModel
import com.mjalijani.splitwisely.domain.usecase.friend.CreateFriendUseCase
import com.mjalijani.splitwisely.domain.usecase.friend.DeleteFriendUseCase
import com.mjalijani.splitwisely.domain.usecase.friend.GetFriendInfoUseCase
import com.mjalijani.splitwisely.domain.usecase.friend.GetFriendsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class FriendsViewModel @Inject constructor(
    private val createFriendUseCase: CreateFriendUseCase,
    private val deleteFriendUseCase: DeleteFriendUseCase,
    private val getFriendsUseCase: GetFriendsUseCase,
    private val getFriendInfoUseCase: GetFriendInfoUseCase
) : ViewModel() {

    init {
        getFriends()
    }

    private fun getFriends() {}
    fun filterFriends() {}
    fun addFriend() {}

}