package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.data.common.KeyValueItem


@Composable
fun SelectableScreen(
    modifier: Modifier = Modifier,
    title: String,
    content: @Composable () -> Unit
) {

    Column(
        modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        TopActionBar(title = title, leftIcon = R.drawable.arrow_left, rightIcon = R.drawable.search)
        content()
    }

}

@Preview
@Composable
private fun SelectableScreenPreview() {
    val fakeItems = listOf(
        KeyValueItem(key = "US Dollar (\$)", "USD"),
        KeyValueItem(key = "United Arab Emirates Dirham (AED)", "AED")
    )
    SelectableScreen(title = stringResource(R.string.currency)) {
        LazyColumn {
            items(fakeItems) {
                RadioItem(selected = false, title = it.key, subtitle = it.value) {}
            }
        }

    }
}