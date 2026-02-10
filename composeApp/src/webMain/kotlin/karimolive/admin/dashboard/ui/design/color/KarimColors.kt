package karimolive.admin.dashboard.design.color

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class KarimColors(
    val primary: Color,
    val onPrimary: Color,

    val background: Color,
    val onBackground: Color,

    val surface: Color,
    val onSurface: Color,

    val card: Color,
    val onCard: Color,

    val accentGreen: Color,
    val accentRed: Color,

    val border: Color,
    val mutedText: Color
)

val LocalKarimColors = staticCompositionLocalOf {
    KarimLightColors
}