package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.mjalijani.splitwisely.R


@Composable
fun SelectableScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
        val (back, title, search) = createRefs()
        Image(
            modifier = Modifier
                .constrainAs(back) { start.linkTo(parent.start) },
            painter = painterResource(R.drawable.arrow_left),
            contentDescription = null
        )
        TextApp(
            modifier = Modifier.constrainAs(title) {

            },
            text = stringResource(R.string.currency),
            textColor = Color.Black
        )
    }
}

@Preview
@Composable
private fun SelectableScreenPreview() {
    SelectableScreen()
}