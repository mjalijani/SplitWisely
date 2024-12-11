package com.mjalijani.splitwisely.ui.login.signIn

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.components.ButtonApp
import com.mjalijani.splitwisely.ui.components.Gap
import com.mjalijani.splitwisely.ui.components.OutLineTextFieldApp
import com.mjalijani.splitwisely.ui.components.PasswordOutLineTextFieldApp
import com.mjalijani.splitwisely.ui.components.TextApp
import com.mjalijani.splitwisely.ui.components.TitleWithDivider
import com.mjalijani.splitwisely.ui.components.TopBar
import com.mjalijani.splitwisely.ui.theme.GraySolid
import com.mjalijani.splitwisely.ui.theme.LightSurface
import com.mjalijani.splitwisely.ui.theme.Neutral
import com.mjalijani.splitwisely.ui.theme.Primary
import com.mjalijani.splitwisely.ui.theme.SecondaryText

@Composable
fun SignInScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Column(
            Modifier
                .background(color = Primary)
                .padding(16.dp)
        ) {
            TopBar()
            Image(painter = painterResource(R.drawable.logo_sample), contentDescription = null)
            Gap(8)
            TextApp(stringResource(R.string.login))
            Gap(8)
            TextApp(stringResource(R.string.login_msg), textColor = LightSurface)
        }
        Column(
            modifier
                .background(color = Color.White)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            OutLineTextFieldApp("", stringResource(R.string.email)){}
            Gap(16)
            PasswordOutLineTextFieldApp("", onValueChange = {}, true)
            Gap(16)
            TextApp(
                text = "Forgot password?",
                textColor = Primary,
                modifier = Modifier.align(Alignment.End)
            )
            Gap(16)
            ButtonApp(text = stringResource(R.string.login)) { }
            Gap(16)
            TitleWithDivider(stringResource(R.string.or_login_with))
            Gap(16)
            ButtonApp(
                text = stringResource(R.string.google),
                backgroundColor = Neutral,
                textColor = GraySolid,
                icon = R.drawable.google
            ) { }
            BasicText(
                text = buildAnnotatedString {
                    pushStyle(SpanStyle(color = SecondaryText))
                    append(stringResource(R.string.don_t_have_an_account))
                    pop()

                    pushStyle(SpanStyle(color = Primary))
                    append(stringResource(R.string.sign_up))
                    pop()
                },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}


@Preview
@Composable
fun SignInScreenPreview(modifier: Modifier = Modifier) {
    SignInScreen()
}