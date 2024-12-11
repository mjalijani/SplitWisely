package com.mjalijani.splitwisely.ui.account.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.data.MockData
import com.mjalijani.splitwisely.ui.components.TextApp
import com.mjalijani.splitwisely.ui.components.TopActionBar
import com.mjalijani.splitwisely.ui.theme.DividerColor
import com.mjalijani.splitwisely.ui.theme.Surface

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    val settingItems = arrayListOf(
        stringResource(R.string.email),
        stringResource(R.string.passcode_lock),
        stringResource(R.string.device_and_push_notification),
        stringResource(R.string.advanced),
        stringResource(R.string.privacy_policy),
        stringResource(R.string.dark_mode)
    )
    val feedbackItems = arrayListOf(
        stringResource(R.string.rate),
        stringResource(R.string.support),
    )

    LazyColumn(
        modifier = modifier
            .background(color = Color.White)
    ) {

        item {
            TopActionBar(
                title = stringResource(R.string.app_name),
                rightIcon = R.drawable.more_vertical,
                rightIconOnClick = {})
            ProfileHeader(profile = MockData.profile)
            HorizontalDivider(thickness = 8.dp, color = Surface)

        }

        item {
            TextApp(
                text = stringResource(R.string.settings),
                textColor = Color.Black,
                modifier = Modifier.padding(16.dp)
            )
        }

        itemsIndexed(settingItems) { index, item ->

            ProfileItemComponent(title = item)
            if (index != settingItems.count()) HorizontalDivider(
                thickness = 1.dp,
                color = DividerColor,
                modifier = Modifier.padding(start = 32.dp)
            )

        }

        item {
            HorizontalDivider(thickness = 8.dp, color = Surface)
        }

        item {
            TextApp(
                text = stringResource(R.string.feedback),
                textColor = Color.Black,
                modifier = Modifier.padding(16.dp)
            )
        }

        itemsIndexed(feedbackItems) { index, item ->
            ProfileItemComponent(title = item)
            if (index != settingItems.count()) HorizontalDivider(
                thickness = 1.dp,
                color = DividerColor,
                modifier = Modifier.padding(start = 32.dp)
            )
        }

        item {
            ProfileBottomItem()
        }
    }

}

@Preview
@Composable
private fun ProfileScreenPreview() {
    ProfileScreen()
}

