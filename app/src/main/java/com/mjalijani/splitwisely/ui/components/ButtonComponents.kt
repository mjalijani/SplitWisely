package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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
        Spacer(Modifier.size(10.dp))
        Text(text = text, color = textColor)
    }
}

@Preview
@Composable
fun AppButtonPreview(modifier: Modifier = Modifier) {
    ButtonApp(text = "copy", icon = R.drawable.copy) { }
}


