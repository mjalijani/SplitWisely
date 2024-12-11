package com.mjalijani.splitwisely.ui.friends.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.mjalijani.splitwisely.ui.theme.LightNeutral
import com.mjalijani.splitwisely.ui.theme.dimen.image_46
import com.mjalijani.splitwisely.ui.theme.dimen.padding_8

val mockTestImage =
    "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/783px-Test-Logo.svg.png"

@Composable
internal fun FriendsItemComponent(modifier: Modifier = Modifier) {
    val shape = RoundedCornerShape(corner = CornerSize(5.dp))
    Column(
        Modifier
            .border(1.dp, LightNeutral, RoundedCornerShape(10.dp))
            .background(color = Color.Transparent, shape = shape)
            .padding(10.dp)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = padding_8),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                modifier = Modifier
                    .size(image_46)
                    .clip(CircleShape),
                model = mockTestImage,
                contentScale = ContentScale.Crop,
                contentDescription = "friend avatar"
            )

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp),
                text = "one of my friends",
                color = Color.Black
            )

        }
        Divider(color = LightNeutral)

        Row(
            modifier = modifier
                .padding(top = 10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Total owe $1500",
                textAlign = TextAlign.Start,
                color = Color.Green
            )

            Text(
                text = "Mustafa owe $150000",
                textAlign = TextAlign.End,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }

}


@Preview
@Composable
private fun FriendsItemComponentPreview() {
    FriendsItemComponent()
}