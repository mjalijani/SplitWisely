package com.mjalijani.splitwisely.ui.expense.comment

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.helper.StringCallBack
import com.mjalijani.splitwisely.ui.components.TextInputApp
import com.mjalijani.splitwisely.ui.theme.Primary
import com.mjalijani.splitwisely.ui.theme.PrimaryText
import com.mjalijani.splitwisely.ui.theme.Surface
import com.mjalijani.splitwisely.ui.theme.ThirdText

@Composable
fun SendMessageView(
    modifier: Modifier = Modifier,
    textValue: String = "",
    send: StringCallBack,
    onValueChange: StringCallBack
) {
    Row(
        modifier = modifier
            .background(
                shape = RoundedCornerShape(corner = CornerSize(50.dp)),
                color = Surface
            )
            .clip(RoundedCornerShape(corner = CornerSize(50.dp)))
    ) {
        val value by remember {
            mutableStateOf(textValue)
        }

        TextInputApp(
            textValue = value,
            textColor = PrimaryText,
            placeHolderColor = ThirdText,
            placeHolder = stringResource(R.string.comment),
            trailingIcon = {
                Icon(
                    modifier = Modifier.clickable {
                        send.invoke(value)
                    },
                    painter = painterResource(R.drawable.ic_send),
                    tint = Primary,
                    contentDescription = null
                )
            }) {
            onValueChange.invoke(it)
        }
    }

}

@Preview
@Composable
private fun SendMessagePreview() {
    SendMessageView(textValue = "", send = {}, onValueChange = {})
}