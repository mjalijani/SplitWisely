package com.mjalijani.splitwisely.ui

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mjalijani.splitwisely.ui.account.AccountScreen

const val accountRoute = "account_route"


fun NavGraphBuilder.accountScreen() {
    composable(route = accountRoute) {
        AccountScreen()
    }
}