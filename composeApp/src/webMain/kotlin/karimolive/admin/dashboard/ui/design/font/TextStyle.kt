package karimolive.admin.dashboard.design.font

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import karimadmin.composeapp.generated.resources.Res
import karimadmin.composeapp.generated.resources.tajawal_bold
import karimadmin.composeapp.generated.resources.tajawal_regular
import org.jetbrains.compose.resources.Font

data class KarimTextStyle(
    val headline: SizedTextStyle,
    val label : SizedTextStyle
)

data class SizedTextStyle(
    val large: TextStyle,
    val medium: TextStyle,
    val small: TextStyle,
)

val tajawalFontFamily : FontFamily
    @Composable
    get() = FontFamily(
        Font(Res.font.tajawal_regular, FontWeight.Normal),
        Font(Res.font.tajawal_bold, FontWeight.Bold)
    )

val karimFont : KarimTextStyle
    @Composable
    get() = KarimTextStyle(
        headline = SizedTextStyle(
        large = TextStyle(
            fontFamily = tajawalFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            lineHeight = 36.sp
        ),
        medium = TextStyle(
            fontFamily = tajawalFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            lineHeight = 32.sp
        ),
        small = TextStyle(
            fontFamily = tajawalFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            lineHeight = 28.sp
        )
    ),
    label = SizedTextStyle(
        large = TextStyle(
            fontFamily = tajawalFontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            lineHeight = 24.sp
        ),
        medium = TextStyle(
            fontFamily = tajawalFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 20.sp
        ),
        small = TextStyle(
            fontFamily = tajawalFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 18.sp
        )
    )
)

val LocalTypography  = staticCompositionLocalOf<KarimTextStyle> { error("local typography  dose not provided")  }