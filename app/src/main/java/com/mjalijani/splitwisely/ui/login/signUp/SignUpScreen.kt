package com.mjalijani.splitwisely.ui.login.signUp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import androidx.constraintlayout.compose.ConstraintLayout
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.components.ButtonApp
import com.mjalijani.splitwisely.ui.components.Gap
import com.mjalijani.splitwisely.ui.components.OutLineTextFieldApp
import com.mjalijani.splitwisely.ui.components.TextApp
import com.mjalijani.splitwisely.ui.components.TopBar
import com.mjalijani.splitwisely.ui.theme.LightSurface
import com.mjalijani.splitwisely.ui.theme.Primary
import com.mjalijani.splitwisely.ui.theme.SecondaryText

@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Column(
            Modifier
                .background(color = Primary)
                .padding(16.dp)
        ) {
            TopBar()
            Image(painter = painterResource(R.drawable.logo_sample), contentDescription = null)
            Gap(8)
            TextApp(stringResource(R.string.sign_up))
            Gap(8)
            TextApp(stringResource(R.string.enter_your_full_name), textColor = LightSurface)
        }
        ConstraintLayout(
            modifier
                .background(color = Color.White)
                .fillMaxSize(),
        ) {
            val (nextButton, emailTextField, userImage, loginText) = createRefs()
            Box(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .background(color = Primary, shape = CircleShape)
                    .size(64.dp)
                    .constrainAs(userImage) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }, contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_camera),
                    contentDescription = null,
                    Modifier.size(24.dp)
                )
            }

            OutLineTextFieldApp(
                modifier = Modifier
                    .constrainAs(emailTextField) {
                        top.linkTo(userImage.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    .padding(16.dp),
                textValue = "",
                onValueChange = {},
                label = stringResource(R.string.full_name)
            )

            ButtonApp(
                modifier = Modifier
                    .constrainAs(nextButton) {
                        bottom.linkTo(loginText.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    .padding(16.dp), text = stringResource(R.string.next)
            ) { }

            BasicText(
                modifier = Modifier
                    .constrainAs(loginText) {
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    .padding(16.dp),
                text = buildAnnotatedString {
                    pushStyle(SpanStyle(color = SecondaryText))
                    append(stringResource(R.string.already_have_an_account))
                    pop()

                    pushStyle(SpanStyle(color = Primary))
                    append(stringResource(R.string.login))
                    pop()
                },
            )
        }
    }
}


@Preview
@Composable
private fun SignUpScreenPreview() {
    SignUpScreen()
}