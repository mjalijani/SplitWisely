package com.mjalijani.splitwisely.data

import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.data.common.TransactionItem
import com.mjalijani.splitwisely.ui.theme.LightSuccess

object MockData {
    val fakeTransaction = TransactionItem(
        profile = R.drawable.ali,
        title = "this is test",
        subtitle = "GameNet",
        dateTime = "Jul 30, 9:37 PM",
        color = LightSuccess
    )
}