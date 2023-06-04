package ru.ershovao.moviesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.ershovao.moviesapp.screens.DetailsScreen
import ru.ershovao.moviesapp.screens.MainScreen
import ru.ershovao.moviesapp.screens.SplashScreen
import ru.ershovao.moviesapp.utils.Constants.Screens.DETAILS_SCREEN
import ru.ershovao.moviesapp.utils.Constants.Screens.MAIN_SCREEN
import ru.ershovao.moviesapp.utils.Constants.Screens.SPLASH_SCREEN

sealed class Screens(val route: String) {
    object Splash : Screens(SPLASH_SCREEN)
    object Main : Screens(MAIN_SCREEN)
    object Details : Screens(DETAILS_SCREEN)
}

@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route
    ) {
        composable(route = Screens.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screens.Main.route) {
            MainScreen()
        }
        composable(route = Screens.Details.route) {
            DetailsScreen()
        }
    }
}