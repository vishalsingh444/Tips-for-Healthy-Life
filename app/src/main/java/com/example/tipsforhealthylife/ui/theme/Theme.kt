package com.example.tipsforhealthylife.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    background = Black,
    surface = Grey900,
    onSurface = Grey100,
    primary = Black,
    onPrimary = Grey100,
    secondary = Grey100,
    secondaryVariant = NavyBlue
)

private val LightColorPalette = lightColors(
    background = White,
    surface = Grey250,
    onSurface = DarkGrey,
    primary = Grey50,
    onPrimary = Grey900,
    secondary = Grey700,
    secondaryVariant = LightRed
)

@Composable
fun TipsForHealthyLifeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}