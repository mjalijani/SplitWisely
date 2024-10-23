package com.mjalijani.splitwisely.ui.navigation.bottomBar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.mjalijani.splitwisely.ui.navigation.accountRoute
import com.mjalijani.splitwisely.ui.navigation.activityRoute
import com.mjalijani.splitwisely.ui.navigation.friendsRoute
import com.mjalijani.splitwisely.ui.navigation.groupsRoute
import com.mjalijani.splitwisely.ui.navigation.navigateToAccount
import com.mjalijani.splitwisely.ui.navigation.navigateToActivity
import com.mjalijani.splitwisely.ui.navigation.navigateToFriends
import com.mjalijani.splitwisely.ui.navigation.navigateToGroup

@Composable
fun rememberBottomBarAppStatus(
    navController: NavHostController = rememberNavController(),
): BottomBarAppStatus {
    return remember(
        navController
    ) {
        BottomBarAppStatus(navController)
    }
}

@Stable
class BottomBarAppStatus(
    val navController: NavHostController,
) {
    val currentDestination: NavDestination?
        @Composable get() = navController.currentBackStackEntryAsState().value?.destination

    val currentNBottomBarDestination: BottomNavBarDestination?
        @Composable get() = when (currentDestination?.route) {
            friendsRoute -> BottomNavBarDestination.FRIENDS
            groupsRoute -> BottomNavBarDestination.GROUPS
//            newExpenseRoute -> BottomNavBarDestination.NEW_EXPENSE
            activityRoute -> BottomNavBarDestination.ACTIVITY
            accountRoute -> BottomNavBarDestination.ACCOUNT
            else -> null
        }

    val navBottomDestinations: List<BottomNavBarDestination> = BottomNavBarDestination.entries

    fun navigateToBottomBarDestination(bottomNavBarDestination: BottomNavBarDestination) {
        val bottomBarNavOptions = navOptions {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }

        when (bottomNavBarDestination) {
            BottomNavBarDestination.FRIENDS -> navController.navigateToFriends(bottomBarNavOptions)
            BottomNavBarDestination.GROUPS -> navController.navigateToGroup(bottomBarNavOptions)
//            BottomNavBarDestination.NEW_EXPENSE -> navController.navigateToNewExpense(bottomBarNavOptions)
            BottomNavBarDestination.ACTIVITY -> navController.navigateToActivity(bottomBarNavOptions)
            BottomNavBarDestination.ACCOUNT -> navController.navigateToAccount(bottomBarNavOptions)
        }
    }
}