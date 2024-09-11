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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.Primary


@Composable
fun AppButton(modifier: Modifier = Modifier, text: String, icon: Int, onClick: () -> Unit) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(corner = CornerSize(8.dp)))
            .background(color = Primary)
            .padding(10.dp)
            .clickable { onClick.invoke() },
        horizontalArrangement = Arrangement.Center
    )
    {
        Image(painter = painterResource(icon), contentDescription = null)
        Spacer(Modifier.size(10.dp))
        Text(text = text, color = Color.White)
    }
}

@Preview
@Composable
fun AppButtonPreview(modifier: Modifier = Modifier) {
    AppButton(text = "copy", icon = R.drawable.copy) { }
}


