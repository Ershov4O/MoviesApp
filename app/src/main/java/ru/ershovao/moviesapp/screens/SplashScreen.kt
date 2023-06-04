package ru.ershovao.moviesapp.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import ru.ershovao.moviesapp.navigation.Screens
import ru.ershovao.moviesapp.ui.theme.MoviesAppTheme

@Composable
fun SplashScreen(navController: NavController) {
    var startAnimate by remember {
        mutableStateOf(false)
    }
    val alphaAnimation = animateFloatAsState(targetValue = if (startAnimate) 1f else 0f)
    LaunchedEffect(key1 = true) {
        startAnimate = true
        delay(2000)
        navController.navigate(Screens.Main.route)
    }
    Splash(alphaAnimation.value)
}

@Composable
fun Splash(alpha: Float) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier
                .size(120.dp)
                .alpha(alpha),
            imageVector = Icons.Default.PlayArrow,
            contentDescription = "",
            tint = Color.Black
        )
    }
}

@Preview
@Composable
fun SplashPreview() {
    MoviesAppTheme {
        SplashScreen(rememberNavController())
    }
}