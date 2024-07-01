package com.mjalijani.splitwisely.ui.activity

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.mjalijani.splitwisely.ui.theme.dimen.image_16
import com.mjalijani.splitwisely.ui.theme.dimen.image_36
import com.mjalijani.splitwisely.ui.theme.dimen.image_46
import com.mjalijani.splitwisely.ui.theme.dimen.padding_16
import com.mjalijani.splitwisely.ui.theme.dimen.padding_4
import com.mjalijani.splitwisely.ui.theme.dimen.padding_8

val mockActivity = ActivityTestModel(
    description = "Mohammad paid Sepehr",
    oweDescription = "You received USD 381,125.00",
    date = "Friday at 11:33",
    userIcon = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/783px-Test-Logo.svg.png",
    activityIcon = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/783px-Test-Logo.svg.png"
)
val mockActivityList = listOf(mockActivity, mockActivity, mockActivity, mockActivity, mockActivity)

@Composable
fun ActivityScreen(
    modifier: Modifier = Modifier,
    viewModel: ActivityViewModel = hiltViewModel()
) {
    LazyColumn(modifier = modifier) {
        items(mockActivityList) {
            ActivityItemComponent(model = it)
            Divider(thickness = 0.5.dp)
        }
    }
}

@Composable
private fun ActivityItemComponent(
    modifier: Modifier = Modifier,
    model: ActivityTestModel
) {
    Row(modifier = modifier.padding(padding_16), verticalAlignment = Alignment.CenterVertically) {
        ActivityImageComponent(userIcon = model.userIcon, activityIcon = model.activityIcon)
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = padding_8)
        ) {
            Text(
                modifier = Modifier.padding(bottom = padding_4),
                text = model.description,
                color = MaterialTheme.colorScheme.onPrimary,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
            Text(
                modifier = Modifier.padding(bottom = padding_4),
                text = model.oweDescription,
                color = MaterialTheme.colorScheme.secondary,
                fontWeight = FontWeight.Medium,
                fontSize = 13.sp
            )
            Text(
                modifier = Modifier.padding(bottom = padding_4),
                text = model.date,
                color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.5f),
                fontWeight = FontWeight.Thin,
                fontSize = 11.sp
            )
        }
    }
}

@Composable
private fun ActivityImageComponent(
    modifier: Modifier = Modifier,
    userIcon: String,
    activityIcon: String
) {
    Box(modifier = modifier) {
        AsyncImage(
            modifier = Modifier
                .size(image_46)
                .align(Alignment.Center)
                .padding(padding_4)
            ,
            model = activityIcon,
            contentDescription = "activity icon",
            contentScale = ContentScale.Crop
        )
        AsyncImage(
            modifier = Modifier
                .size(image_16)
                .clip(CircleShape)
                .align(Alignment.BottomEnd),
            model = userIcon,
            contentDescription = "user icon",
            contentScale = ContentScale.Crop
        )
    }
}

@Preview
@Composable
private fun ActivityImageComponentPreview() {
    ActivityImageComponent(
        userIcon = mockActivity.userIcon,
        activityIcon = mockActivity.activityIcon
    )
}

@Preview
@Composable
private fun ActivityItemComponentPreview() {
    ActivityItemComponent(model = mockActivity)
}


@Preview
@Composable
private fun ActivityScreenPreview(modifier: Modifier = Modifier) {
    ActivityScreen()
}