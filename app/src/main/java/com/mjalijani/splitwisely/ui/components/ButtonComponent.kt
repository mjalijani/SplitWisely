package com.mjalijani.splitwisely.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.Primary


@Composable
fun ButtonApp(
    modifier: Modifier = Modifier,
    backgroundColor: Color = Primary,
    text: String,
    textColor: Color = Color.White,
    icon: Int? = null,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(corner = CornerSize(8.dp)))
            .background(color = backgroundColor)
            .padding(10.dp)
            .clickable { onClick.invoke() },
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        icon?.let {
            Image(painter = painterResource(it), contentDescription = null)
        }
        Gap(10)
        Text(text = text, color = textColor)
    }
}

@Composable
fun OutlineButton(
    modifier: Modifier = Modifier,
    text: String,
    @DrawableRes iconResId: Int,
    cornerRadius: Dp = 8.dp,
    outlineColor: Color = Primary,
    outlineWidth: Dp = 1.dp,
    textSize: TextUnit = TextUnit.Unspecified,
    textColor: Color = Primary,
    tint: Color = Primary,
    onClick: () -> Unit
) {
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(cornerRadius),
        border = BorderStroke(outlineWidth, outlineColor)
    ) {
        Row {
            Icon(
                painter = painterResource(iconResId),
                tint = tint,
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Gap(8)
            Text(text = text, fontSize = textSize, color = textColor)
        }
    }
}

@Composable
fun CircularButton(
    modifier: Modifier = Modifier.size(40.dp),
    @DrawableRes iconResId: Int,
    backgroundColor: Color = Primary,
    iconTint: Color = Color.White,
    onClick: () -> Unit,
) {
    Surface(
        modifier = modifier,
        shape = CircleShape,
        color = backgroundColor
    ) {
        IconButton(onClick = onClick) {
            Icon(
                painter = painterResource(id = iconResId),
                contentDescription = null,
                tint = iconTint,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Preview
@Composable
private fun CircularButtonPreview() {
    CircularButton(iconResId = R.drawable.receipt_add) {}
}

@Preview
@Composable
private fun OutlineButtonPreview() {
    OutlineButton(text = stringResource(R.string.create_group), iconResId = R.drawable.ic_group) {}
}

@Preview
@Composable
fun AppButtonPreview(modifier: Modifier = Modifier) {
    ButtonApp(text = stringResource(R.string.copy), icon = R.drawable.copy) { }
}


