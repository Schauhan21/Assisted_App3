package com.example.assistedapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.assistedapp.ui.home.Home
import com.example.assistedapp.ui.login.Login
import com.example.assistedapp.ui.payment.Payment

@Composable
fun MobileComputingApp(
    appState: MobileComputingAppState = rememberMobileComputingAppState()
) {
    NavHost(
        navController = appState.navController,
        startDestination = "login"
    ) {
        composable(route = "login") {
            Login(navController = appState.navController)
        }
        composable(route = "home") {
            Home(
                navController = appState.navController
            )
        }
        composable(route = "payment") {
            Payment(onBackPress = appState::navigateBack)
        }
    }
}