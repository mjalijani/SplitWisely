package com.mjalijani.splitwisely

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.mjalijani.splitwisely.ui.navigation.accountScreen
import com.mjalijani.splitwisely.ui.navigation.activityRoute
import com.mjalijani.splitwisely.ui.navigation.activityScreen
import com.mjalijani.splitwisely.ui.navigation.bottomBar.BottomBar
import com.mjalijani.splitwisely.ui.navigation.bottomBar.BottomBarAppStatus
import com.mjalijani.splitwisely.ui.navigation.bottomBar.rememberBottomBarAppStatus
import com.mjalijani.splitwisely.ui.navigation.friendsScreen
import com.mjalijani.splitwisely.ui.navigation.groupsScreen
import com.mjalijani.splitwisely.ui.navigation.navigateToProfile
import com.mjalijani.splitwisely.ui.navigation.newExpenseScreen
import com.mjalijani.splitwisely.ui.navigation.profileScreen
import com.mjalijani.splitwisely.ui.theme.SplitWiselyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SplitWiselyTheme {
                val appState: BottomBarAppStatus = rememberBottomBarAppStatus()
                val navController = appState.navController
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    content = { innerPadding ->
                        NavHost(
                            modifier = Modifier.padding(innerPadding),
                            navController = navController,
                            startDestination = activityRoute
                        ) {
                            accountScreen(
                                navigateToProfile = { navController.navigateToProfile() }
                            )
                            profileScreen()
                            activityScreen()
                            friendsScreen()
                            groupsScreen()
                            newExpenseScreen()
                        }

                    },
                    bottomBar = {
                        BottomBar(
                            destinations = appState.navBottomDestinations,
                            onNavigateToDestination = appState::navigateToBottomBarDestination,
                            currentDestination = appState.currentDestination,
                            modifier = Modifier.testTag("BottomBar"),
                        )
                    }
                )
            }
        }
    }
}