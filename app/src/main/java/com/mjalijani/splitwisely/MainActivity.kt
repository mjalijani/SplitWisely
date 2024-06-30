package com.mjalijani.splitwisely

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.mjalijani.splitwisely.ui.accountRoute
import com.mjalijani.splitwisely.ui.accountScreen
import com.mjalijani.splitwisely.ui.navigateToProfile
import com.mjalijani.splitwisely.ui.profileScreen
import com.mjalijani.splitwisely.ui.theme.SplitWiselyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SplitWiselyTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        modifier = Modifier.padding(innerPadding),
                        navController = navController,
                        startDestination = accountRoute
                    ) {
                        accountScreen(
                            navigateToProfile = {navController.navigateToProfile()}
                        )
                        profileScreen()
                    }
                }
            }
        }
    }
}