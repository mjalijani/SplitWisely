package com.mjalijani.splitwisely.ui.invite

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.components.AnimationViewApp
import com.mjalijani.splitwisely.ui.components.ButtonApp
import com.mjalijani.splitwisely.ui.components.Gap
import com.mjalijani.splitwisely.ui.components.TextApp
import com.mjalijani.splitwisely.ui.components.TopActionBar
import com.mjalijani.splitwisely.ui.theme.SecondaryText
import com.mjalijani.splitwisely.ui.theme.Surface

@Composable
fun InviteScreen(modifier: Modifier = Modifier) {

    Box(
        modifier
            .fillMaxSize()
            .background(color = Color.White),
    ) {

        TopActionBar(
            modifier = Modifier
                .align(Alignment.TopCenter),
            title = stringResource(R.string.invite_link),
            leftIcon = R.drawable.arrow_left,
            leftIconOnClick = {})

        Column(
            modifier
                .padding(16.dp)
                .align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Gap(46)

            AnimationViewApp(R.raw.chain, Modifier.size(150.dp))

            TextApp(text = stringResource(R.string.invite_link), textColor = Color.Black)

            Gap(16)

            TextApp(
                modifier = Modifier.padding(horizontal = 30.dp),
                text = stringResource(R.string.invite_msg),
                textColor = SecondaryText,
                textAlignment = TextAlign.Center
            )

            Gap(56)

            TextApp(
                text = stringResource(R.string.link_sample),
                textColor = SecondaryText,
                maxLine = 1,
                modifier = Modifier
                    .background(
                        shape = RoundedCornerShape(corner = CornerSize(8.dp)),
                        color = Surface
                    )
                    .padding(16.dp)
            )

        }

        Row(
            Modifier
                .padding(16.dp)
                .align(Alignment.BottomCenter)
        ) {
            ButtonApp(
                modifier.weight(1f),
                text = stringResource(R.string.share),
                icon = R.drawable.ic_share
            ) { }

            Gap(16)

            ButtonApp(
                modifier.weight(1f),
                text = stringResource(R.string.copy),
                icon = R.drawable.copy
            ) { }
        }
    }
}


@Preview
@Composable
fun InviteScreenPreview(modifier: Modifier = Modifier) {
    InviteScreen()
}