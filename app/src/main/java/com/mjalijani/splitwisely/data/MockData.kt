package com.mjalijani.splitwisely.data

import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.data.common.TransactionItem
import com.mjalijani.splitwisely.ui.account.profile.Profile

object MockData {
    val fakeTransaction = TransactionItem(
        profile = R.drawable.ali,
        title = "this is test",
        subtitle = "GameNet",
        secondTitle = "Jul 30, 9:37 PM",
    )

    val profile = Profile(
    R.drawable.ali,
    name = "Amir Hussein",
    email = "aj.alijani@gmail.com",
    phone = "+98123456789"
    )
}