package com.mjalijani.splitwisely.ui.friends.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.mjalijani.splitwisely.ui.theme.dimen.image_36
import com.mjalijani.splitwisely.ui.theme.dimen.padding_8

val mockTestImage =
    "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/783px-Test-Logo.svg.png"

@Composable
internal fun FriendsItemComponent(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = padding_8),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            modifier = Modifier
                .size(image_36)
                .clip(CircleShape),
            model = mockTestImage,
            contentScale = ContentScale.Crop,
            contentDescription = "friend avatar"
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = padding_8)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier.weight(1f)) {
                    Text(
                        modifier = Modifier.align(Alignment.CenterStart),
                        text = "one of my friends",
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
                Column(horizontalAlignment = Alignment.End) {
                    Text(
                        text = "owes you",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Thin,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "$ 3,111.063",
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }
        }

    }
}


@Preview
@Composable
private fun FriendsItemComponentPreview() {
    FriendsItemComponent()
}