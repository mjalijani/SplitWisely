package com.mjalijani.splitwisely.ui.login.resetPassword

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.components.ButtonApp
import com.mjalijani.splitwisely.ui.components.Gap
import com.mjalijani.splitwisely.ui.components.OutLineTextFieldApp
import com.mjalijani.splitwisely.ui.components.TextApp
import com.mjalijani.splitwisely.ui.components.TitleWithDivider
import com.mjalijani.splitwisely.ui.components.TopBar
import com.mjalijani.splitwisely.ui.theme.GraySolid
import com.mjalijani.splitwisely.ui.theme.LightSurface
import com.mjalijani.splitwisely.ui.theme.Neutral
import com.mjalijani.splitwisely.ui.theme.Primary

@Composable
fun ResetPasswordScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Column(
            Modifier
                .background(color = Primary)
                .padding(16.dp)
        ) {
            TopBar(hasBack = true)
            Image(painter = painterResource(R.drawable.logo_sample), contentDescription = null)
            Gap(8)
            TextApp(stringResource(R.string.reset_password))
            Gap(8)
            TextApp(stringResource(R.string.reset_pass_msg), textColor = LightSurface)
        }
        Column(
            modifier
                .background(color = Color.White)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            OutLineTextFieldApp("", onValueChange = {}, stringResource(R.string.email))

            Gap(16)
            ButtonApp(text = stringResource(R.string.reset_password)) { }
            Gap(16)
            TitleWithDivider(stringResource(R.string.or_reset_password_with))
            Gap(16)
            ButtonApp(
                text = stringResource(R.string.phone_number),
                backgroundColor = Neutral,
                textColor = GraySolid
            ) { }
        }
    }
}


@Preview
@Composable
private fun ResetPasswordScreenPreview() {
    ResetPasswordScreen()
}