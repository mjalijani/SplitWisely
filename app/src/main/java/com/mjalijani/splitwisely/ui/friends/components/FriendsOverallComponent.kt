package com.mjalijani.splitwisely.ui.friends.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.dimen.image_24
import com.mjalijani.splitwisely.ui.theme.dimen.image_36

@Composable
internal fun FriendsOverallComponent(
    modifier: Modifier = Modifier,
    oweValue: String,
    owedValue: String
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Text(
                text = "Overall, you owe $oweValue",
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = 14.sp
            )
            Text(
                text = "and you are owed $owedValue",
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = 14.sp
            )
        }
        Image(
            modifier = Modifier.size(image_36),
            painter = painterResource(id = R.drawable.ic_filter),
            contentDescription = "filter friends"
        )
    }
}

@Preview
@Composable
private fun FriendsOverallComponentPreview() {
    FriendsOverallComponent(oweValue = "34,000", owedValue = "234,42343")
}