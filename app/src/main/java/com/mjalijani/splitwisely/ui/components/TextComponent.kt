package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.ui.theme.Divider
import com.mjalijani.splitwisely.ui.theme.SecondaryText

@Composable
fun TextApp(text: String, textColor: Color = Color.White, modifier: Modifier = Modifier) {
    Text(modifier = modifier, text = text, color = textColor)
}

@Preview
@Composable
private fun TextAppPreview() {
    TextApp(text = "Login")
}

@Composable
fun TitleWithDivider(title: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        HorizontalDivider(
            modifier = Modifier.weight(1f),
            thickness = 1.dp,
            color = Divider
        )


        Text(
            text = title,
            modifier = Modifier
                .padding(horizontal = 16.dp),
            style = MaterialTheme.typography.bodyMedium.copy(color = SecondaryText),
            textAlign = TextAlign.Center
        )


        HorizontalDivider(
            modifier = Modifier.weight(1f),
            thickness = 1.dp,
            color = Divider
        )
    }
}

@Preview
@Composable
fun PreviewTitleWithDivider() {
    Surface {
        TitleWithDivider(title = "Or Login with")
    }
}