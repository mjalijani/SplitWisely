package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.Primary

@Composable
fun TakePicture(
    modifier: Modifier = Modifier
        .size(60.dp)
        .clip(shape = CircleShape)
        .background(color = Primary)
        .padding(16.dp),
    onClick: () -> Unit
) {
    Image(
        modifier = modifier.clickable { onClick.invoke() },
        painter = painterResource(R.drawable.ic_camera),
        contentDescription = null
    )
}

@Preview
@Composable
private fun TakePicturePreview() {
    TakePicture() {}
}