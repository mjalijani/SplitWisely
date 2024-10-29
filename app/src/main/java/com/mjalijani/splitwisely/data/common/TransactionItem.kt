package com.mjalijani.splitwisely.data.common

import androidx.compose.ui.graphics.Color

data class TransactionItem(
    val profile: Int,
    val title: String,
    val subtitle: String,
    val dateTime: String,
    val color: Color
)
