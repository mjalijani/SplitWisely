package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.data.common.KeyValueItem
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

            Gap(8)

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

@Composable
fun SimpleItem(
    modifier: Modifier = Modifier,
    item: KeyValueItem,
    onSelected: (KeyValueItem) -> Unit
) {
    ConstraintLayout(
        modifier = modifier
            .clickable {
                onSelected.invoke(item)
            }
            .background(color = Color.White)
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        val (back, titleText, search, divider) = createRefs()

        item.icon?.let { icon ->
            Image(
                modifier = Modifier
                    .constrainAs(back) {
                        start.linkTo(parent.start)
                        top.linkTo(parent.top)
                        bottom.linkTo(divider.top)
                    },
                painter = painterResource(icon),
                contentDescription = null
            )
        }

        TextApp(
            modifier = Modifier
                .padding(start = 16.dp)
                .constrainAs(titleText) {
                    start.linkTo(if (item.icon != null) back.end else parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(divider.top)
                },
            text = item.key,
            textColor = Color.Black
        )

        TextApp(
            modifier = Modifier
                .padding(start = 16.dp)
                .constrainAs(search) {
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(divider.top)
                },
            text = item.value,
            textColor = Color.Black
        )

        HorizontalDivider(
            modifier = Modifier
                .padding(top = 8.dp)
                .constrainAs(divider) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                },
            thickness = 1.dp,
            color = DividerColor
        )
    }

}

@Preview
@Composable
private fun SimpleItemPreview() {
    SimpleItem(item = KeyValueItem("Afghanistan", "+93", icon = R.drawable.af)) {}
}

@Preview
@Composable
private fun RadioItemPreview() {
    RadioItem(selected = true, title = "title", subtitle = "subtitle") {}
}

@Preview
@Composable
private fun ListOfRadioItemPreview() {
    LazyColumn {
        items(4) {
            RadioItem(selected = true, title = "title", subtitle = "subtitle") {}
        }
    }
}

@Preview
@Composable
private fun ListOfSelectedItemPreview() {
    LazyColumn {
        items(4) {
            SimpleItem(item = KeyValueItem(key = "Title", value = "value", icon = R.drawable.af)) {}
        }
    }
}