package com.mjalijani.splitwisely.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF4DB6AC),
    secondary = Color(0xFF673AB7),
    primaryContainer = Color(0xFF303030),
    onPrimaryContainer = Color(0xFFEAF1F3),
    secondaryContainer = Color(0xFF461302),
    onSecondaryContainer = Color(0xFFAFDBE9),
    background = Color(0xFF242424),
    surface = Color(0xFF301C3B),
    onPrimary = Color(0xFFE9E9E9),
    onSecondary = Color.White,
    tertiaryContainer = Color(0xFF301C3B),
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFFC5C5C5),
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF4DB6AC),
    secondary = Color(0xFF673AB7),
    tertiary = Color(0xFFE57373),
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFCCCCCC),
    onPrimary = Color(0xFFCCCCCC),
    onSecondary = Color.Black,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    primaryContainer = Color(0xFF8A9DA7),
    onPrimaryContainer = Color(0xFF1D323D),
    secondaryContainer = Color(0xFFA5D2F7),
    onSecondaryContainer = Color(0xFF02455C)
)

@Composable
fun SplitWiselyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}