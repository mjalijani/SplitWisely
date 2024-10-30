package com.mjalijani.splitwisely.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.data.MockData.fakeTransaction
import com.mjalijani.splitwisely.data.common.TransactionItem
import com.mjalijani.splitwisely.ui.theme.LightNeutral
import com.mjalijani.splitwisely.ui.theme.Neutral
import com.mjalijani.splitwisely.ui.theme.Surface

@Composable
fun ExpenseItem(
    modifier: Modifier = Modifier,
    item: TransactionItem
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = item.profile),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Gap(4)

        Column(modifier = Modifier.weight(1f)) {
            TextApp(
                item.title,
                textColor = item.titleColor
            )

            Gap(4)

            item.subtitle?.let {
                TextApp(
                    text = it,
                    textColor = item.subtitleColor
                )
            }

        }

        Column {
            item.secondTitle?.let {
                TextApp(
                    text = it,
                    textColor = item.secondTitleColor
                )
            }

            Gap(4)

            item.secondSubtitle?.let {
                TextApp(
                    text = it,
                    textColor = item.secondSubtitleColor
                )
            }
        }
    }
}

@Composable
fun GroupSummaryCard(
    profileImageRes: Int,
    groupName: String,
) {
    var moreVisibility by remember {
        mutableStateOf(false)
    }

    ElevatedCard(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = profileImageRes),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = groupName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f)
                )

                MultiCircularProfile(
                    firstProfileImage = R.drawable.ali,
                    secondProfileImage = R.drawable.ali,
                    count = 10
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Neutral)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 8.dp, bottom = 4.dp, start = 8.dp, end = 8.dp)
                ) {
                    TextApp(
                        text = stringResource(R.string.total_owe),
                        textColor = Color.Gray
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    TextApp(
                        modifier = Modifier.clickable {
                            moreVisibility = moreVisibility.not()
                        },
                        text = stringResource(R.string.details),
                        icon = R.drawable.ic_arrow_down,
                        textColor = Color.Gray
                    )
                }

                AnimatedVisibility(visible = moreVisibility) {

                    Column {
                        HorizontalDivider(
                            thickness = 1.dp,
                            color = LightNeutral,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )

                        LazyColumn {

                            items(4) {
                                ExpenseItem(
                                    item = fakeTransaction,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }

                        }
                    }

                }
            }

        }
    }
}

@Composable
fun MultiCircularProfile(
    modifier: Modifier = Modifier,
    firstProfileImage: Int,
    secondProfileImage: Int,
    count: Int
) {
    Row(modifier, verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = firstProfileImage),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(24.dp)
                .zIndex(2f)
                .clip(CircleShape)
        )
        Image(
            painter = painterResource(id = secondProfileImage),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(24.dp)
                .offset(x = (-3).dp)
                .clip(CircleShape)
                .zIndex(1f)
        )

        TextApp(
            text = "+$count",
            textColor = Color.Black,
            textSize = 11.sp,
            modifier = Modifier
                .size(24.dp)
                .offset(x = (-6).dp)
                .background(Surface, shape = CircleShape)
                .wrapContentSize(align = Alignment.Center)
        )

    }
}

@Preview
@Composable
private fun MultiCircularProfilePreview() {
    MultiCircularProfile(
        firstProfileImage = R.drawable.ali,
        secondProfileImage = R.drawable.ali,
        count = 10
    )
}

@Preview
@Composable
private fun GroupSummaryCardPreview() {
    GroupSummaryCard(
        profileImageRes = R.drawable.ali,
        groupName = "Group name",
    )
}


@Preview
@Composable
private fun ExpenseItemPreview() {
    ExpenseItem(
        item = fakeTransaction
    )
}