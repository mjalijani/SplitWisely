package com.mjalijani.splitwisely.ui.account.profile

import androidx.lifecycle.ViewModel
import com.mjalijani.splitwisely.domain.usecase.user.GetCurrentUserUseCase
import com.mjalijani.splitwisely.domain.usecase.user.UpdateUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val getCurrentUserUseCase: GetCurrentUserUseCase,
    private val updateUserUseCase: UpdateUserUseCase
) : ViewModel() {

    init {

    }

    private fun getProfile() {

    }

    private fun updateProfile() {

    }
}