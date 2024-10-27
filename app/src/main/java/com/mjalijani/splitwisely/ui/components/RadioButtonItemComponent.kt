package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.ui.theme.DividerColor
import com.mjalijani.splitwisely.ui.theme.ThirdText

@Composable
fun RadioItem(
    modifier: Modifier = Modifier,
    selected: Boolean,
    title: String,
    subtitle: String,
    onSelectedChange: (Boolean) -> Unit
) {
    Column(
        modifier = modifier
            .background(color = Color.White)
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            RadioButton(
                selected = selected,
                onClick = { onSelectedChange(!selected) }
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(text = title)
                Text(text = subtitle, color = ThirdText)
            }
        }
        HorizontalDivider(
            modifier = Modifier.padding(start = 56.dp),
            thickness = 1.dp,
            color = DividerColor
        )
    }

}


@Preview
@Composable
private fun RadioItemPreview() {
    RadioItem(selected = true, title = "title", subtitle = "subtitle") {}
}

@Preview
@Composable
private fun ListOfRadioItemPreview() {
    LazyColumn() {
        items(4) {
            RadioItem(selected = true, title = "title", subtitle = "subtitle") {}
        }
    }
}