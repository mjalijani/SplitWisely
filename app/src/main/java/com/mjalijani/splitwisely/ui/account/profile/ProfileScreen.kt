package com.mjalijani.splitwisely.ui.account.profile

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.dimen.image_16
import com.mjalijani.splitwisely.ui.theme.dimen.padding_4
import com.mjalijani.splitwisely.ui.theme.dimen.padding_8

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(padding_8)
            .scrollable(state = scrollState, orientation = Orientation.Vertical)
    ) {
        ProfileItemComponent(
            title = stringResource(id = R.string.full_name),
            value = "Sepehr full name"
        )
        ProfileItemComponent(
            title = stringResource(id = R.string.email_address),
            value = "sepehr.test@test.com"
        )
        ProfileItemComponent(
            title = stringResource(id = R.string.phone_number),
            value = "+989366666666"
        )
        ProfileItemComponent(title = stringResource(id = R.string.password), value = "********")
        ProfileDropDown(items = listOf("testing","test"), title = "Time zone")
        ProfileDropDown(items = listOf("testing"), title = "Default currency")
        ProfileDropDown(items = listOf("testing"), title = "Language")
    }
}

@Preview
@Composable
private fun ProfileScreenPreview() {
    ProfileScreen()
}

