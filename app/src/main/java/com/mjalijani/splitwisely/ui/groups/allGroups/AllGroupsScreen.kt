package com.mjalijani.splitwisely.ui.groups.allGroups

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.data.MockData.fakeTransaction
import com.mjalijani.splitwisely.ui.components.ExpenseItem
import com.mjalijani.splitwisely.ui.components.Gap
import com.mjalijani.splitwisely.ui.components.TextApp
import com.mjalijani.splitwisely.ui.components.TopActionBar
import com.mjalijani.splitwisely.ui.theme.DividerColor

@Composable
fun GroupsScreen(modifier: Modifier = Modifier) {

    Column(
        modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        TopActionBar(
            title = stringResource(R.string.app_name),
            rightIcon = R.drawable.search,
            rightIconOnClick = { }
        )

        TextApp(
            modifier = Modifier.padding(16.dp),
            text = stringResource(R.string.groups),
            textColor = Color.Black
        )

        Gap(8)

        LazyColumn(modifier = Modifier.padding(horizontal = 16.dp)) {
            items(4) {
                ExpenseItem(item = fakeTransaction)
                HorizontalDivider(
                    thickness = 1.dp,
                    color = DividerColor,
                    modifier = Modifier.padding(start = 42.dp, top = 8.dp, bottom = 8.dp)
                )
            }
        }

    }

}

@Preview
@Composable
private fun GroupsScreenPreview() {
    GroupsScreen()
}