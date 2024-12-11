package com.mjalijani.splitwisely.ui.expense.comment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun CommentScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        val (sendMessage) = createRefs()



        SendMessageView(modifier = Modifier
            .padding(8.dp)
            .constrainAs(sendMessage) {
                bottom.linkTo(parent.bottom)
            },
            textValue = "",
            send = {},
            onValueChange = {}
        )
    }
}

@Preview
@Composable
private fun CommentScreenPreview() {
    CommentScreen()
}