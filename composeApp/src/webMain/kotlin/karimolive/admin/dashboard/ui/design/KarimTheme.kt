package karimolive.admin.dashboard.design

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import karimolive.admin.dashboard.design.color.KarimColors
import karimolive.admin.dashboard.design.color.KarimDarkColors
import karimolive.admin.dashboard.design.color.KarimLightColors
import karimolive.admin.dashboard.design.color.LocalKarimColors
import karimolive.admin.dashboard.design.font.KarimTextStyle
import karimolive.admin.dashboard.design.font.LocalTypography
import karimolive.admin.dashboard.design.font.karimFont

@Composable
fun KarimTheme(
    darkTheme: Boolean,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) KarimDarkColors else KarimLightColors

    CompositionLocalProvider(
        LocalKarimColors provides colors,
        LocalTypography  provides karimFont
    ) {
        content()
    }
}

object AppTheme {
    val color: KarimColors
        @Composable @ReadOnlyComposable
        get() = LocalKarimColors.current

    val textStyle: KarimTextStyle
        @Composable @ReadOnlyComposable
        get() = LocalTypography.current
}