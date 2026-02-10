package karimolive.admin.dashboard.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import karimadmin.composeapp.generated.resources.Res
import karimadmin.composeapp.generated.resources.app_name
import karimadmin.composeapp.generated.resources.ic_left_arrow
import karimadmin.composeapp.generated.resources.ic_website_link
import karimadmin.composeapp.generated.resources.view_store
import karimolive.admin.dashboard.BackStackProvider
import karimolive.admin.dashboard.components.utils.clickAnimation
import karimolive.admin.dashboard.design.AppTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable

fun Sidebar(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxHeight().verticalScroll(
            rememberScrollState()
        ).width(288.dp).background(AppTheme.color.primary).padding(vertical = 16.dp)
    ) {
        Text(
            text = stringResource(Res.string.app_name),
            style = AppTheme.textStyle.headline.large,
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(bottom = 32.dp),
            color = AppTheme.color.card
        )
        val backStack = BackStackProvider.current
        SidebarItem.entries.forEach {
            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                MenuItem(
                    painter = painterResource(it.icon),
                    text = stringResource(it.labelId),
                    modifier = Modifier.clickAnimation({
                        backStack.add(it.route)
                    }
                    )
                )
                Spacer(Modifier.fillMaxWidth().height(0.5.dp).background(AppTheme.color.border))
            }
        }
        Spacer(Modifier.weight(1f))
        MenuItem(
            painter = painterResource(Res.drawable.ic_website_link),
            text = stringResource(Res.string.view_store),
        )
    }
}

@Composable
fun MenuItem(
    painter: Painter,
    text: String,
    modifier: Modifier = Modifier
) {
    val isHovered = remember { MutableInteractionSource() }
    val backgroundColor =
        animateColorAsState(
            if (isHovered.collectIsHoveredAsState().value)
                AppTheme.color.accentGreen else AppTheme.color.primary
        )
    Row(
        modifier = modifier.hoverable(
            interactionSource = isHovered,
        ).background(backgroundColor.value)
            .padding(vertical = 8.dp, horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .size(24.dp),
            tint = AppTheme.color.card
        )
        Text(
            text = text,
            style = AppTheme.textStyle.label.small,
            color = AppTheme.color.card,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(start = 8.dp).weight(1f),

            )
        Icon(
            painter = painterResource(Res.drawable.ic_left_arrow),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .rotate(180f),
            tint = AppTheme.color.card
        )
    }
}