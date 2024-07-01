package com.mjalijani.splitwisely.ui.account.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.dimen.padding_8

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(padding_8)
            .verticalScroll(state = scrollState)
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
        ProfileDropDown(items = listOf("testing", "test"), title = "Time zone")
        ProfileDropDown(items = listOf("testing"), title = "Default currency")
        ProfileDropDown(items = listOf("testing"), title = "Language")
        SaveProfileButton(onClick = {})
    }
}

@Preview
@Composable
private fun ProfileScreenPreview() {
    ProfileScreen()
}

