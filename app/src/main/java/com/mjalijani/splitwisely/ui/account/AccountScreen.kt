package com.mjalijani.splitwisely.ui.account

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mjalijani.splitwisely.R

@Composable
fun AccountScreen(
    modifier: Modifier = Modifier,
    navigateToProfile: () -> Unit,
    viewModel: AccountViewModel = hiltViewModel()
) {
    val scrollState = rememberScrollState()
    /*
    note :
    will use lazyColumn here later when data models are ready,
    also Dividers will be removed from here.
    this is just a sample
    * */
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(scrollState)
    ) {
        AccountTopBarComponent()

        AccountProfileItemComponent(
            fullName = "test full name",
            email = "test@test.com",
            phone = "",
            onClick = { navigateToProfile.invoke() })
        AccountItemComponent(title = stringResource(R.string.email), iconRes = R.drawable.ic_sms)

    }
}

@Preview
@Composable
private fun AccountScreenPreview() {
    AccountScreen(navigateToProfile = {})
}

