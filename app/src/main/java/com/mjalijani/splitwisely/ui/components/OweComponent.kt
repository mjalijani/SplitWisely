package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.LightSuccess

@Composable
fun Owe(modifier: Modifier = Modifier, title: String, amount: String) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp),
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFFFAFAFA),
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            TextApp(text = title, textColor = Color.Black)
            TextApp(
                text = amount,
                textColor = LightSuccess,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

@Composable
fun OweHorizontally(modifier: Modifier = Modifier, oweYouAmount: String, youOweAmount: String) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Owe(
            modifier = Modifier.weight(1f),
            title = stringResource(R.string.owe_you),
            amount = oweYouAmount
        )
        Owe(
            modifier = Modifier.weight(1f),
            title = stringResource(R.string.you_owe),
            amount = youOweAmount
        )

    }
}

@Preview
@Composable
private fun OweHorizontallyPreview() {
    OweHorizontally(oweYouAmount = "1,0000", youOweAmount = "20,000")
}

@Preview
@Composable
private fun OwePreview() {
    Owe(title = stringResource(R.string.owe_you), amount = "1,000,000 rials")
}