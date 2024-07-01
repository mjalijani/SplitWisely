package com.mjalijani.splitwisely.ui.navigation.bottomBar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy


@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    destinations: List<BottomNavBarDestination>,
    onNavigateToDestination: (BottomNavBarDestination) -> Unit,
    currentDestination: NavDestination?,
) {
    ChatGptNavigationBar(
        modifier = Modifier
    ) {
        destinations.forEach { destination ->
            val selected = currentDestination.isSelectedDestinationInHierarchy(destination)
            ChatGptNavigationBarItem(
                selected = selected,
                onClick = {
                    onNavigateToDestination(destination)
                },
                icon = {
                    Icon(
                        painter = painterResource(destination.unselectedIcon),
                        contentDescription = null,
                    )
                },
                selectedIcon = {
                    Icon(
                        painter = painterResource(id = destination.selectedIcon),
                        contentDescription = null,
                    )
                },
                label = {
                    destination.iconTextId?.let {
                        Text(stringResource(destination.iconTextId))
                    }
                },
            )
        }
    }


}

private fun NavDestination?.isSelectedDestinationInHierarchy(destination: BottomNavBarDestination) =
    this?.hierarchy?.any {
        it.route?.contains(destination.name, true) ?: false
    } ?: false

@Composable
fun ChatGptNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit,
) {
    NavigationBar(
        modifier = modifier,
        contentColor = ChatGptNavigationDefaults.navigationContentColor(),
        tonalElevation = 20.dp,
        content = content,
    )
}

@Composable
fun RowScope.ChatGptNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    selectedIcon: @Composable () -> Unit = icon,
    enabled: Boolean = true,
    label: @Composable (() -> Unit)? = null,
    alwaysShowLabel: Boolean = true,
) {
    NavigationBarItem(
        selected = selected,
        onClick = onClick,
        icon = if (selected) selectedIcon else icon,
        modifier = modifier,
        enabled = enabled,
        label = label,
        alwaysShowLabel = alwaysShowLabel,
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = ChatGptNavigationDefaults.navigationSelectedItemColor(),
            unselectedIconColor = ChatGptNavigationDefaults.navigationUnselectedContentColor(),
            selectedTextColor = ChatGptNavigationDefaults.navigationSelectedItemColor(),
            unselectedTextColor = ChatGptNavigationDefaults.navigationUnselectedContentColor(),
            indicatorColor = ChatGptNavigationDefaults.navigationIndicatorColor(),
        ),
    )
}


object ChatGptNavigationDefaults {
    @Composable
    fun navigationContentColor() = Color.Transparent

    @Composable
    fun navigationUnselectedContentColor() = Color.Gray

    @Composable
    fun navigationSelectedItemColor() = Color.Blue

    @Composable
    fun navigationIndicatorColor() = MaterialTheme.colorScheme.surface
}