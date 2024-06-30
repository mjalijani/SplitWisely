package com.mjalijani.splitwisely.ui.account

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mjalijani.splitwisely.R

@Composable
fun AccountScreen(
    modifier: Modifier = Modifier,
    viewModel: AccountViewModel = hiltViewModel()
) {
    val scrollState = rememberScrollState()
    /*
    note :
    will use lazyColumn here later when data models are ready,
    also Dividers will be removed from here.
    this is just a sample
    * */
    Column(
        modifier = modifier
            .fillMaxSize()
            .scrollable(scrollState, orientation = Orientation.Vertical)
    ) {
        AccountTopBarComponent()
        AccountTitleComponent()

        AccountHeaderItemComponent(title = "Settings")
        AccountProfileItemComponent(fullName = "test full name", email = "test@test.com")
        AccountItemComponent(title = "Scan Code", iconRes = R.drawable.ic_scan)
        Divider(thickness = 0.5.dp)
        AccountItemComponent(title = "SplitWisely Pro")
        Divider(thickness = 0.5.dp)

        AccountHeaderItemComponent(title = "Preferences")
        AccountItemComponent(title = "Notifications")
        Divider(thickness = 0.5.dp)
        AccountItemComponent(title = "Passcode")

        AccountHeaderItemComponent(title = "Feedback")
        AccountItemComponent(title = "Rate SplitWisely")
        Divider(thickness = 0.5.dp)
        AccountItemComponent(title = "Contact us")
    }
}

@Preview
@Composable
private fun AccountScreenPreview() {
    AccountScreen()
}

