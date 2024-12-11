package com.mjalijani.splitwisely.ui.navigation.bottomBar

import com.mjalijani.splitwisely.R

enum class BottomNavBarDestination(
    val selectedIcon: Int,
    val unselectedIcon: Int,
    val iconTextId: Int?
) {
    FRIENDS(
        selectedIcon = R.drawable.friends_selected,
        unselectedIcon = R.drawable.friends,
        iconTextId = R.string.friends
    ),
    GROUPS(
        selectedIcon = R.drawable.friends_selected,
        unselectedIcon = R.drawable.friends,
        iconTextId = R.string.groups,
    ),
    ACTIVITY(
        selectedIcon = R.drawable.history_selected,
        unselectedIcon = R.drawable.history,
        iconTextId = R.string.activity,
    ),
    ACCOUNT(
        selectedIcon = R.drawable.profile_selected,
        unselectedIcon = R.drawable.profile,
        iconTextId = R.string.account,
    )
    ;

}
