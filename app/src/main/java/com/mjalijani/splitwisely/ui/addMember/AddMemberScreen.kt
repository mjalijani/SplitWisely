package com.mjalijani.splitwisely.ui.addMember

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
import com.mjalijani.splitwisely.data.MockData
import com.mjalijani.splitwisely.ui.components.TextApp
import com.mjalijani.splitwisely.ui.components.TopActionBar
import com.mjalijani.splitwisely.ui.theme.DividerColor
import com.mjalijani.splitwisely.ui.theme.LightSurface
import com.mjalijani.splitwisely.ui.theme.SecondaryText

@Composable
fun AddMemberScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        TopActionBar(
            title = stringResource(R.string.add_member),
            leftIcon = R.drawable.arrow_left,
            leftIconOnClick = {})

        MemberBox(modifier = Modifier.padding(16.dp))

        TextApp(
            modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
            text = stringResource(R.string.friends_on_splitwisely),
            textColor = SecondaryText
        )

        LazyColumn {
            items(6) {
                MemberSelectableItem(
                    modifier.padding(horizontal = 16.dp),
                    profile = MockData.profile
                ) { }
                HorizontalDivider(
                    thickness = 1.dp,
                    color = DividerColor,
                    modifier = Modifier.padding(start = 34.dp, bottom = 8.dp, top = 8.dp)
                )
            }
            item {
                HorizontalDivider(thickness = 8.dp, color = LightSurface)
            }

        }

    }
}

@Preview
@Composable
private fun AddMemberScreenPreview() {
    AddMemberScreen()
}