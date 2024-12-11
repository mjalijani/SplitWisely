package com.mjalijani.splitwisely.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: String = stringResource(R.string.app_name),
    titleColor: Color = Color.White,
    hasBack: Boolean = false
) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (hasBack) Image(
            painter = painterResource(R.drawable.arrow_left),
            contentDescription = null
        )
        Gap(16)
        TextApp(title, textColor = titleColor)
    }
}


@Composable
fun TopActionBar(
    modifier: Modifier = Modifier,
    title: String,
    leftIcon: Int? = null,
    @DrawableRes rightIcon: Int? = null,
    leftIconOnClick: (() -> Unit)? = null,
    rightIconOnClick: (() -> Unit)? = null
) {
    ElevatedCard(
        modifier = modifier,
        shape = RoundedCornerShape(0.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {


            leftIcon?.let { icon ->
                Icon(
                    modifier = Modifier
                        .clickable {
                            leftIconOnClick?.invoke()
                        },
                    painter = painterResource(icon),
                    contentDescription = null
                )
            }

            TextApp(
                modifier = Modifier
                    .weight(1f)
                    .wrapContentWidth(align = Alignment.Start)
                    .padding(start = 16.dp),
                text = title,
                textColor = Color.Black
            )

            rightIcon?.let { icon ->
                Icon(
                    modifier = Modifier
                        .clickable {
                            rightIconOnClick?.invoke()
                        },
                    painter = painterResource(icon),
                    contentDescription = null
                )
            }

        }
    }
}

@Preview
@Composable
private fun TopActionBarPreview() {
    TopActionBar(
        title = stringResource(R.string.currency),
        leftIcon = R.drawable.arrow_left,
        rightIcon = R.drawable.arrow_left
    )
}

@Preview
@Composable
private fun TopBarPreview() {
    TopBar(hasBack = true)
}
