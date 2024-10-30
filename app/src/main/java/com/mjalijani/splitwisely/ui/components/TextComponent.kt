package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.DividerColor
import com.mjalijani.splitwisely.ui.theme.SecondaryText
import com.mjalijani.splitwisely.ui.theme.ThirdText

@Composable
fun TextApp(
    text: String,
    textColor: Color = Color.White,
    textSize: TextUnit = TextUnit.Unspecified,
    icon: Int? = null,
    iconTint: Color = ThirdText,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = modifier,
            text = text,
            color = textColor,
            fontSize = textSize
        )
        icon?.let {
            Icon(
                modifier = Modifier.padding(start = 8.dp),
                painter = painterResource(icon),
                tint = iconTint,
                contentDescription = null
            )
        }
    }
}

@Preview
@Composable
private fun TextAppPreview() {
    TextApp(text = stringResource(R.string.details), icon = R.drawable.ic_arrow_up)
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
            color = DividerColor
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
            color = DividerColor
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