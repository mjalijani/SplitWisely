package com.mjalijani.splitwisely.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.components.Gap
import com.mjalijani.splitwisely.ui.components.GroupSummaryCard
import com.mjalijani.splitwisely.ui.components.OutlineButton
import com.mjalijani.splitwisely.ui.components.OweHorizontally
import com.mjalijani.splitwisely.ui.components.TextApp
import com.mjalijani.splitwisely.ui.components.TopActionBar
import com.mjalijani.splitwisely.ui.theme.Primary
import com.mjalijani.splitwisely.ui.theme.Surface

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column {
            TopActionBar(
                title = stringResource(R.string.app_name),
                rightIcon = R.drawable.search,
                rightIconOnClick = { }
            )

            OweHorizontally(oweYouAmount = "0", youOweAmount = "0")

            HomeScreenContent()

        }

        FloatingActionButton(
            onClick = { },
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.BottomEnd),
            shape = CircleShape,
            containerColor = Primary,
            contentColor = Color.White
        ) {
            Icon(
                painter = painterResource(R.drawable.receipt_add),
                contentDescription = "دکمه گرد پایین چپ"
            )
        }
    }
}

@Composable
fun HomeScreenContent(modifier: Modifier = Modifier) {
    Column(Modifier.padding(horizontal = 16.dp)) {
        Row(
            modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            TextApp(stringResource(R.string.groups), Color.Black)

            OutlineButton(
                text = stringResource(R.string.filter),
                iconResId = R.drawable.ic_filter,
                outlineColor = Surface,
                textColor = Color.Black,
                tint = Color.Black
            ) { }
        }

        LazyColumn(Modifier.padding(top = 8.dp)) {
            items(4) {
                GroupSummaryCard(
                    profileImageRes = R.drawable.ali,
                    groupName = "Group name",
                )
                Gap(8)
            }
        }
    }
}

@Composable
fun NoGroupScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            TextApp(
                text = stringResource(R.string.no_group),
                textColor = Color.Gray
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlineButton(
                iconResId = R.drawable.ic_group,
                text = stringResource(R.string.create_group)
            ) { }
        }
    }
}

@Preview
@Composable
private fun NoGroupScreenPreview() {
    NoGroupScreen()
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}