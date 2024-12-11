package com.mjalijani.splitwisely.ui.friends

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.friends.components.FriendsItemComponent
import com.mjalijani.splitwisely.ui.friends.components.FriendsOverallComponent
import com.mjalijani.splitwisely.ui.theme.dimen.image_24
import com.mjalijani.splitwisely.ui.theme.dimen.padding_16
import com.mjalijani.splitwisely.ui.theme.dimen.padding_8

@Composable
fun FriendsScreen(
    modifier: Modifier = Modifier,
    viewModel: FriendsViewModel = hiltViewModel()
) {
    Column(modifier = modifier.padding(padding_8)) {
        FriendsTopBar(modifier = Modifier.padding(bottom = padding_16))
        LazyColumn(modifier = Modifier) {
            item { FriendsOverallComponent(oweValue = "$ 128,000", owedValue = "$ 6,500") }
            item {
                Text(
                    modifier = Modifier.padding(top = 20.dp , bottom = 10.dp),
                    text = stringResource(id = R.string.groups),
                    fontWeight = FontWeight.Bold
                )
            }
            items(30) {
                FriendsItemComponent()
                Spacer(modifier = Modifier.size(10.dp))
            }
        }
    }
}


@Composable
private fun FriendsTopBar(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxWidth()) {
        Image(
            modifier = Modifier
                .size(image_24)
                .align(Alignment.CenterEnd),
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "search friends"
        )
        Text(
            modifier = Modifier.align(Alignment.CenterStart),
            text = stringResource(id = R.string.add_friends),
            color = MaterialTheme.colorScheme.primary
        )
    }
}

@Preview
@Composable
private fun FriendsTopBarPreview() {
    FriendsTopBar()
}

@Preview
@Composable
private fun FriendsScreenPreview() {
    FriendsScreen()
}

