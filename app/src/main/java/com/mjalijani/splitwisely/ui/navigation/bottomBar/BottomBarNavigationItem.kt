package com.mjalijani.splitwisely.ui.navigation.bottomBar

import com.mjalijani.splitwisely.R

enum class BottomNavBarDestination(
    val selectedIcon: Int,
    val unselectedIcon: Int,
    val iconTextId: Int?
) {
    FRIENDS(
        selectedIcon = R.drawable.ic_person_selected,
        unselectedIcon = R.drawable.ic_person_unselected,
        iconTextId = R.string.friends
    ),
    GROUPS(
        selectedIcon = R.drawable.ic_group_selected,
        unselectedIcon = R.drawable.ic_group_unselected,
        iconTextId = R.string.groups,
    ),
    NEW_EXPENSE(
        selectedIcon = R.drawable.ic_new_expense,
        unselectedIcon = R.drawable.ic_new_expense,
        iconTextId = null,
    ),
    ACTIVITY(
        selectedIcon = R.drawable.ic_activity_selected,
        unselectedIcon = R.drawable.ic_activity_unselected,
        iconTextId = R.string.activity,
    ),
    ACCOUNT(
        selectedIcon = R.drawable.ic_account_selected,
        unselectedIcon = R.drawable.ic_account_unselected,
        iconTextId = R.string.account,
    )
    ;

}
