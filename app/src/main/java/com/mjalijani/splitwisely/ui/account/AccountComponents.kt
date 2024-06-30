package com.mjalijani.splitwisely.ui.account

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.mjalijani.splitwisely.ui.theme.dimen.image_16
import com.mjalijani.splitwisely.ui.theme.dimen.image_24
import com.mjalijani.splitwisely.ui.theme.dimen.padding_16
import com.mjalijani.splitwisely.ui.theme.dimen.padding_24
import com.mjalijani.splitwisely.ui.theme.dimen.padding_32
import com.mjalijani.splitwisely.ui.theme.dimen.padding_4
import com.mjalijani.splitwisely.ui.theme.dimen.padding_8


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
                    colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary)
                )
            }
            Text(modifier = Modifier,text = title, color = MaterialTheme.colorScheme.onPrimary, fontSize = 16.sp)
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
internal fun AccountHeaderItemComponent(modifier: Modifier = Modifier, title: String) {
    Text(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = padding_8, vertical = padding_24),
        text = title,
        color = MaterialTheme.colorScheme.onPrimary,
        fontSize = 14.sp,
        textAlign = TextAlign.Start
    )
}

@Composable
internal fun AccountTopBarComponent(
    modifier: Modifier = Modifier,
    onSearchClick: (() -> Unit)? = null,
    onUpgradeClick: (() -> Unit)? = null
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(padding_8)
    ) {
        Icon(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .clickable { onSearchClick?.invoke() },
            imageVector = Icons.Default.Search,
            contentDescription = "search button",
            tint = MaterialTheme.colorScheme.onPrimary
        )
        Text(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .clickable { onUpgradeClick?.invoke() },
            text = "Get SplitWisely Pro!",
            color = MaterialTheme.colorScheme.secondary,
            fontSize = 18.sp
        )
    }
}

@Composable
internal fun AccountTitleComponent(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = padding_8, vertical = padding_16),
        text = "Account",
        color = MaterialTheme.colorScheme.onPrimary,
        fontSize = 22.sp,
        textAlign = TextAlign.Start
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