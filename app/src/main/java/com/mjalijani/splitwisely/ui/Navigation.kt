package com.mjalijani.splitwisely.ui

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.mjalijani.splitwisely.ui.account.AccountScreen
import com.mjalijani.splitwisely.ui.account.profile.ProfileScreen

const val accountRoute = "account_route"
const val profileRoute = "profile_route"

fun NavGraphBuilder.accountScreen(
    navigateToProfile : () -> Unit
) {
    composable(route = accountRoute) {
        AccountScreen(navigateToProfile = navigateToProfile)
    }
}

fun NavGraphBuilder.profileScreen() {
    composable(route = profileRoute) {
        ProfileScreen()
    }
}

fun NavController.navigateToProfile(navOptions: NavOptions? = null) {
    this.navigate(profileRoute, navOptions)
}