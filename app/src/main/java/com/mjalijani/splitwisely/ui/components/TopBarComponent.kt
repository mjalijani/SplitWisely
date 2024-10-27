package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R

@Composable
fun TopBar(modifier: Modifier = Modifier, hasBack: Boolean = false) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (hasBack) Image(
            painter = painterResource(R.drawable.arrow_left),
            contentDescription = null
        )
        Spacer(Modifier.size(16.dp))
        Text(stringResource(R.string.app_name), color = Color.White)
    }
}

@Preview
@Composable
private fun TopBarPreview() {
    TopBar()
}
