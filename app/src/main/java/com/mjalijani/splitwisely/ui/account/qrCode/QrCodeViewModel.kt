package com.mjalijani.splitwisely.ui.account.qrCode

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QrCodeViewModel @Inject constructor() : ViewModel() {
    init {
        generateMyQrCode()
    }

    private fun generateMyQrCode() {

    }

    private fun scanQrCode(){

    }
}