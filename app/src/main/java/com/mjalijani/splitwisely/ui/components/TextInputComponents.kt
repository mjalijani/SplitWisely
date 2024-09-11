package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.ui.theme.Surface

@Composable
fun AppTextInput(
    modifier: Modifier = Modifier,
    textValue: String = "https://www.spliter.com/join/p12fsdJHRsb+3164154153",
    onValueChange: (String) -> Unit
) {
    val value by remember {
        mutableStateOf(textValue)
    }
    TextField(
        modifier = modifier
            .clip(shape = RoundedCornerShape(corner = CornerSize(8.dp)))
            .background(color = Surface),
        value = value,
        onValueChange = {
            onValueChange.invoke(it)
        }
    )
}

@Preview
@Composable
fun AppTextInputPreview(modifier: Modifier = Modifier) {
    AppTextInput() {

    }
}