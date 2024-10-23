package com.mjalijani.splitwisely.ui.account

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.dimen.image_16
import com.mjalijani.splitwisely.ui.theme.dimen.image_24
import com.mjalijani.splitwisely.ui.theme.dimen.image_46
import com.mjalijani.splitwisely.ui.theme.dimen.padding_16
import com.mjalijani.splitwisely.ui.theme.dimen.padding_24
import com.mjalijani.splitwisely.ui.theme.dimen.padding_4
import com.mjalijani.splitwisely.ui.theme.dimen.padding_8

private const val mockImageUrl =
    "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/783px-Test-Logo.svg.png"

@Composable
internal fun AccountProfileItemComponent(
    modifier: Modifier = Modifier,
    fullName: String,
    email: String,
    phone: String,
    profilePicUrl: String = mockImageUrl,
    onClick: (() -> Unit)? = null,
    onProfilePictureClick: (() -> Unit)? = null
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick?.invoke() }
            .padding(horizontal = padding_8, vertical = padding_16),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .height(image_46)
                    .width(image_46)
                    .clickable { onProfilePictureClick?.invoke() }
            ) {
                AsyncImage(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding_4)
                        .clip(CircleShape),
                    model = profilePicUrl,
                    contentDescription = "profile picture",
                    contentScale = ContentScale.Crop
                )
                Image(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .height(image_16)
                        .width(image_16),
                    painter = painterResource(id = R.drawable.circular_camera),
                    contentDescription = "take picture",
                )
            }
            Column(
                modifier = Modifier.padding(start = padding_16),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    modifier = Modifier.padding(bottom = padding_4),
                    text = fullName,
                    color = MaterialTheme.colorScheme.onPrimary,
                    fontSize = 14.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Text(
                    modifier = Modifier,
                    text = email,
                    color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.5f),
                    fontSize = 11.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Text(
                    modifier = Modifier,
                    text = phone,
                    color = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.5f),
                    fontSize = 11.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        Icon(
            modifier = Modifier
                .height(image_16)
                .width(image_16),
            imageVector = Icons.Filled.KeyboardArrowRight,
            contentDescription = "action",
            tint = MaterialTheme.colorScheme.onSurface // this may have to be updated later
        )
    }
}

@Composable
internal fun AccountItemComponent(
    modifier: Modifier = Modifier,
    iconRes: Int? = null,
    title: String,
    onClick: (() -> Unit)? = null
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick?.invoke() }
            .padding(horizontal = padding_8, vertical = padding_16),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
            iconRes?.let {
                AsyncImage(
                    modifier = Modifier
                        .padding(end = padding_8)
                        .height(image_24)
                        .width(image_24),
                    model = iconRes,
                    contentDescription = "icon",
                    contentScale = ContentScale.Crop, // may need to be updated later
                    colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.onPrimary)
                )
            }
            Text(
                modifier = Modifier,
                text = title,
                color = Color.Black,
                fontSize = 14.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
        Icon(
            modifier = Modifier
                .height(image_24)
                .width(image_24),
            imageVector = Icons.Filled.KeyboardArrowRight,
            contentDescription = "action",
            tint = MaterialTheme.colorScheme.onSurface // this may have to be updated later
        )
    }
}


@Composable
internal fun AccountHeaderItemComponent(modifier: Modifier = Modifier, title: String) {
    Text(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = padding_8, vertical = padding_24),
        text = title,
        color = MaterialTheme.colorScheme.onPrimary,
        fontSize = 12.sp,
        textAlign = TextAlign.Start,
    )
}

@Composable
internal fun AccountTopBarComponent(
    modifier: Modifier = Modifier,
    onSearchClick: (() -> Unit)? = null,
    onUpgradeClick: (() -> Unit)? = null
) {

    ElevatedCard(modifier = Modifier
        .shadow(5.dp)) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(horizontal = 16.dp, vertical = 9.dp)
        ) {
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .clickable { onUpgradeClick?.invoke() },
                text = stringResource(id = R.string.app_name),
                color = Color.Black,
                fontSize = 16.sp
            )

            Row(
                modifier = Modifier.align(Alignment.CenterEnd)
            ) {
                Image(
                    modifier = Modifier
                        .clickable { onSearchClick?.invoke() },
                    painter = painterResource(R.drawable.scan_barcode),
                    contentDescription = "scan button",
                )

                Spacer(Modifier.size(16.dp))

                Image(
                    modifier = Modifier
                        .clickable { onSearchClick?.invoke() },
                    painter = painterResource(R.drawable.more_vertical),
                    contentDescription = "more",
                )
            }

        }
    }

}

@Composable
internal fun AccountTitleComponent(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = padding_8, vertical = padding_16),
        text = stringResource(id = R.string.account),
        color = MaterialTheme.colorScheme.onPrimary,
        fontSize = 20.sp,
        textAlign = TextAlign.Start
    )
}

@Preview
@Composable
private fun AccountProfileItemComponentPreview(modifier: Modifier = Modifier) {
    AccountProfileItemComponent(
        fullName = "test full name",
        email = "Sepehr.test@gmail.com",
        phone = "09389069112"
    )
}

@Preview
@Composable
private fun AccountTitleComponentPreview(modifier: Modifier = Modifier) {
    AccountTitleComponent()
}

@Preview
@Composable
private fun AccountTopBarComponentPreview() {
    AccountTopBarComponent()
}

@Preview
@Composable
private fun AccountItemComponentPreview() {
    AccountItemComponent(title = "Contact Us")
}

@Preview
@Composable
private fun AccountHeaderItemComponentPreview() {
    AccountHeaderItemComponent(title = "Settings")
}