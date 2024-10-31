package com.mjalijani.splitwisely.ui.expense.comment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.components.TextInputApp
import com.mjalijani.splitwisely.ui.theme.Surface

@Composable
fun SendMessageView(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(
                shape = RoundedCornerShape(corner = CornerSize(50.dp)),
                color = Surface
            )
            .clip(RoundedCornerShape(corner = CornerSize(50.dp)))
    ) {
        TextInputApp(placeHolder = stringResource(R.string.comment)) {

        }
    }

}

@Preview
@Composable
private fun SendMessagePreview() {
    SendMessageView()
}