package com.mjalijani.splitwisely.ui.account.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.data.MockData
import com.mjalijani.splitwisely.ui.components.TextApp
import com.mjalijani.splitwisely.ui.theme.Primary
import com.mjalijani.splitwisely.ui.theme.SecondaryText
import com.mjalijani.splitwisely.ui.theme.Surface
import com.mjalijani.splitwisely.ui.theme.ThirdText

data class Profile(val image: Int, val name: String, val email: String, val phone: String)

@Composable
internal fun ProfileItemComponent(
    modifier: Modifier = Modifier,
    title: String,
) {
    Row(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(painter = title.getIconFromTitle(), contentDescription = null)
        TextApp(text = title, textColor = Color.Black, modifier = Modifier.padding(start = 8.dp))
    }
}

@Composable
fun String.getIconFromTitle(): Painter = when (this) {
    stringResource(R.string.email) -> painterResource(R.drawable.ic_email)
    stringResource(R.string.passcode_lock) -> painterResource(R.drawable.ic_lock)
    stringResource(R.string.device_and_push_notification) -> painterResource(R.drawable.ic_notification)
    stringResource(R.string.advanced) -> painterResource(R.drawable.ic_setting)
    stringResource(R.string.privacy_policy) -> painterResource(R.drawable.ic_shield_tick)
    stringResource(R.string.dark_mode) -> painterResource(R.drawable.ic_moon)
    stringResource(R.string.rate) -> painterResource(R.drawable.ic_star)
    stringResource(R.string.support) -> painterResource(R.drawable.ic_message_question)
    else -> {
        painterResource(R.drawable.rounded_rectangle)
    }
}

@Composable
fun ProfileHeader(modifier: Modifier = Modifier, profile: Profile) {
    with(profile) {
        Row(
            modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(16.dp)
        ) {

            ProfileWithCustomIcon(
                profileImage = painterResource(image),
                littleIcon = painterResource(R.drawable.circular_camera)
            ) {}

            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp),
                verticalArrangement = Arrangement.Center
            ) {
                TextApp(name, textColor = Color.Black)
                TextApp(email, modifier = modifier.padding(top = 4.dp), textColor = SecondaryText)
                TextApp(phone, modifier = modifier.padding(top = 2.dp), textColor = ThirdText)
            }

        }
    }
}

@Composable
fun ProfileWithCustomIcon(
    modifier: Modifier = Modifier,
    profileImage: Painter,
    littleIcon: Painter,
    littleIconSize: Dp = 24.dp,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier.size(64.dp)
    ) {

        Image(
            painter = profileImage,
            contentDescription = stringResource(R.string.profile_image),
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape)
        )

        Icon(
            painter = littleIcon,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .clickable {
                    onClick.invoke()
                }
                .size(littleIconSize)
                .align(Alignment.BottomEnd)
                .offset(x = (-2).dp, y = (-2).dp)
        )
    }
}

@Composable
fun ProfileBottomItem(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxWidth()
            .background(color = Surface)
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextApp(stringResource(R.string.made_with_heart), textColor = Primary)
        TextApp("Version 3.0.3", textColor = SecondaryText, modifier = Modifier.padding(top = 8.dp))
    }
}

@Preview
@Composable
private fun ProfileBottomItemPreview() {
    ProfileBottomItem()
}

@Preview
@Composable
private fun ProfileItemComponentPreview() {
    ProfileItemComponent(title = stringResource(R.string.email))
}

@Preview
@Composable
private fun ProfileHeaderPreview() {
    ProfileHeader(
        profile = MockData.profile
    )
}
