package com.mjalijani.splitwisely.ui.navigation

import androidx.compose.material3.Text
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.mjalijani.splitwisely.ui.account.AccountScreen
import com.mjalijani.splitwisely.ui.account.profile.ProfileScreen
import com.mjalijani.splitwisely.ui.activity.ActivityScreen

const val friendsRoute = "friends_route"
const val newExpenseRoute = "new_expense"
const val groupsRoute = "groups_route"
const val activityRoute = "activity_route"
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

fun NavGraphBuilder.activityScreen() {
    composable(route = activityRoute) {
        ActivityScreen()
    }
}

fun NavGraphBuilder.friendsScreen() {
    composable(route = friendsRoute) {
        Text(text = "testing")
    }
}

fun NavGraphBuilder.groupsScreen() {
    composable(route = groupsRoute) {
        Text(text = "testing")
    }
}

fun NavGraphBuilder.newExpenseScreen() {
    composable(route = newExpenseRoute) {
        Text(text = "testing")
    }
}

fun NavController.navigateToFriends(navOptions: NavOptions? = null) {
    this.navigate(friendsRoute, navOptions)
}

fun NavController.navigateToGroup(navOptions: NavOptions? = null) {
    this.navigate(groupsRoute, navOptions)
}

fun NavController.navigateToNewExpense(navOptions: NavOptions? = null) {
    this.navigate(newExpenseRoute, navOptions)
}

fun NavController.navigateToActivity(navOptions: NavOptions? = null) {
    this.navigate(activityRoute, navOptions)
}

fun NavController.navigateToAccount(navOptions: NavOptions? = null) {
    this.navigate(accountRoute, navOptions)
}

fun NavController.navigateToProfile(navOptions: NavOptions? = null) {
    this.navigate(profileRoute, navOptions)
}