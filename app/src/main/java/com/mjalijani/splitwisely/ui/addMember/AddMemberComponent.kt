package com.mjalijani.splitwisely.ui.addMember

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.data.MockData
import com.mjalijani.splitwisely.ui.account.profile.Profile
import com.mjalijani.splitwisely.ui.account.profile.ProfileWithCustomIcon
import com.mjalijani.splitwisely.ui.components.TextApp
import com.mjalijani.splitwisely.ui.theme.OutlineEnabled
import com.mjalijani.splitwisely.ui.theme.Surface300
import com.mjalijani.splitwisely.ui.theme.ThirdText

@Composable
fun MemberItem(modifier: Modifier = Modifier, profile: Profile, closeClick: () -> Unit) {
    with(profile) {
        TextApp(
            modifier = modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(corner = CornerSize(100.dp)))
                .background(color = Surface300)
                .padding(2.dp),
            leftIcon = image,
            maxLine = 1,
            text = name,
            rightIcon = R.drawable.ic_close,
            textColor = Color.Black,
            leftIconClick = { closeClick.invoke() }
        )
    }

}

@Composable
fun MemberSelectableItem(
    modifier: Modifier = Modifier,
    profile: Profile,
    caption: String? = null,
    onClick: () -> Unit
) {
    with(profile) {
        Row(
            modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .clickable { onClick.invoke() },
            verticalAlignment = Alignment.CenterVertically
        ) {
            ProfileWithCustomIcon(
                modifier = Modifier.size(32.dp),
                profileImage = painterResource(image),
                littleIcon = painterResource(R.drawable.success_circular),
                littleIconSize = 10.dp
            ) {}

            TextApp(
                modifier = Modifier
                    .padding(start = 4.dp)
                    .weight(1f),
                maxLine = 1,
                text = name,
                textColor = Color.Black
            )

            caption?.let {
                TextApp(textColor = ThirdText, text = it)
            }
        }
    }

}

@Composable
fun MemberBox(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = modifier
            .fillMaxWidth()
            .border(
                shape = RoundedCornerShape(corner = CornerSize(8.dp)),
                border = BorderStroke(width = 1.dp, color = OutlineEnabled)
            )
            .clip(RoundedCornerShape(corner = CornerSize(8.dp)))
            .padding(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(5) {
            MemberItem(profile = MockData.profile, modifier = Modifier.fillMaxWidth()) {}
        }
    }
}

@Preview
@Composable
private fun MemberBoxPreview() {
    MemberBox()
}

@Preview
@Composable
private fun MemberSelectableItemPreview() {
    MemberSelectableItem(
        profile = MockData.profile,
        caption = stringResource(R.string.already_in_group)
    ) {}
}

@Preview
@Composable
private fun MemberItemPreview() {
    MemberItem(profile = MockData.profile) {}
}