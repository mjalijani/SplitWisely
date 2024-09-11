package com.mjalijani.splitwisely.ui.expense.invite

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.components.AppButton
import com.mjalijani.splitwisely.ui.components.AppTextInput
import com.mjalijani.splitwisely.ui.theme.Surface

@Composable
fun InviteScreen(modifier: Modifier = Modifier) {

    Column(
        modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            modifier = Modifier.padding(horizontal = 30.dp),
            text = "Anyone can follow this link to join “Game net” Only share it with people you trust.",
            textAlign = TextAlign.Center,
            color = Surface
        )

        AppTextInput { }

        Row(Modifier.padding(10.dp)) {
            AppButton(
                modifier = Modifier.weight(1f),
                text = stringResource(R.string.share),
                icon = R.drawable.share
            ) { }

            Spacer(Modifier.size(10.dp))

            AppButton(
                modifier = Modifier.weight(1f),
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