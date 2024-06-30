package com.mjalijani.splitwisely.ui.account.profile

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.dimen.corner_8
import com.mjalijani.splitwisely.ui.theme.dimen.image_16
import com.mjalijani.splitwisely.ui.theme.dimen.padding_4
import com.mjalijani.splitwisely.ui.theme.dimen.padding_8


@Composable
internal fun ProfileItemComponent(
    modifier: Modifier = Modifier,
    title: String,
    value: String,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = padding_4)
    ) {
        ProfileItemHeader(title = title)
        Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
            Text(
                modifier = Modifier.padding(end = padding_4),
                text = value,
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            EditComponent()
        }
    }
}

@Composable
private fun EditComponent(modifier: Modifier = Modifier) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Icon(
            modifier = Modifier
                .height(image_16)
                .width(image_16),
            imageVector = Icons.Default.Edit,
            contentDescription = "edit",
            tint = MaterialTheme.colorScheme.secondary
        )
        Text(
            modifier = Modifier,
            text = stringResource(id = R.string.edit),
            color = MaterialTheme.colorScheme.secondary,
            fontSize = 13.sp,
        )
    }
}

@Composable
internal fun ProfileDropDown(modifier: Modifier = Modifier, items: List<String>, title: String) {
    val expanded = remember { mutableStateOf(false) }
    val selectedItem = remember { mutableStateOf("") }
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = padding_4)
    ) {
        ProfileItemHeader(title = title)
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    shape = RoundedCornerShape(corner_8),
                    color = MaterialTheme.colorScheme.primaryContainer,
                    width = 0.5.dp
                )
                .clip(RoundedCornerShape(corner_8))
                .clickable { expanded.value = true }
                .padding(padding_8),
            text = selectedItem.value
        )
        DropdownMenu(
            expanded = expanded.value,
            onDismissRequest = { expanded.value = false }) {
            items.forEach {
                DropdownMenuItem(
                    text = {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = it,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    },
                    onClick = {
                        expanded.value = expanded.value.not()
                    },
                )
            }
        }
    }
}

@Composable
private fun ProfileItemHeader(modifier: Modifier = Modifier, title: String) {
    Text(
        modifier = modifier,
        text = title,
        color = MaterialTheme.colorScheme.onPrimary,
        fontSize = 14.sp,
        fontWeight = FontWeight.Light
    )
}

@Preview
@Composable
private fun ProfileDropDownPreview() {
    ProfileDropDown(items = listOf("test1", "test2", "test3"), title = "title")
}


@Preview
@Composable
private fun ProfileItemComponentPreview() {
    ProfileItemComponent(title = "title", value = "value")
}

@Preview
@Composable
private fun EditComponentPreview() {
    EditComponent()
}
