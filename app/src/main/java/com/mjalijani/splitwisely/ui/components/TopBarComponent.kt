package com.mjalijani.splitwisely.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.mjalijani.splitwisely.R

@Composable
fun TopBar(modifier: Modifier = Modifier, hasBack: Boolean = false) {
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
        Text(stringResource(R.string.app_name), color = Color.White)
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
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            val (back, titleText, search) = createRefs()

            leftIcon?.let { icon ->
                Image(
                    modifier = Modifier
                        .clickable {
                            leftIconOnClick?.invoke()
                        }
                        .constrainAs(back) {
                            start.linkTo(parent.start)
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                        },
                    painter = painterResource(icon),
                    contentDescription = null
                )
            }

            TextApp(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .constrainAs(titleText) {
                        start.linkTo(if (leftIcon != null) back.end else parent.start)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    },
                text = title,
                textColor = Color.Black
            )

            rightIcon?.let { icon ->
                Image(
                    modifier = Modifier
                        .clickable {
                            rightIconOnClick?.invoke()
                        }
                        .constrainAs(search) {
                            end.linkTo(parent.end)
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
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
    TopActionBar(title = stringResource(R.string.currency))
}

@Preview
@Composable
private fun TopBarPreview() {
    TopBar()
}
