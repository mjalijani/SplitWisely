package com.mjalijani.splitwisely.data.common

import androidx.compose.ui.graphics.Color

data class TransactionItem(
    val profile: Int,
    val title: String,
    val subtitle: String? = null,
    val secondTitle: String? = null,
    val secondSubtitle: String? = null,
    val titleColor: Color = Color.Black,
    val subtitleColor: Color = Color.Black,
    val secondTitleColor: Color = Color.Black,
    val secondSubtitleColor: Color = Color.Black,
)
