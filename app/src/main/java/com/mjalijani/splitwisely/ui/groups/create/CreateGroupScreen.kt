package com.mjalijani.splitwisely.ui.groups.create

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.components.ButtonApp
import com.mjalijani.splitwisely.ui.components.HintView
import com.mjalijani.splitwisely.ui.components.OutLineTextFieldApp
import com.mjalijani.splitwisely.ui.components.SwitchApp
import com.mjalijani.splitwisely.ui.components.TakePicture
import com.mjalijani.splitwisely.ui.components.TopActionBar
import com.mjalijani.splitwisely.ui.theme.Surface

@Composable
fun CreateGroupScreen(modifier: Modifier = Modifier) {
    Box(
        modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        TopActionBar(
            modifier.align(Alignment.TopCenter),
            title = stringResource(R.string.new_group),
            leftIcon = R.drawable.arrow_left,
            leftIconOnClick = {}
        )

        Column(
            modifier
                .align(Alignment.TopCenter)
                .padding(vertical = 72.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            TakePicture() {}

            OutLineTextFieldApp(
                label = stringResource(R.string.group_name),
                textValue = "",
                modifier = Modifier.padding(16.dp)
            ) {

            }

            HorizontalDivider(thickness = 8.dp, color = Surface)

            SwitchApp(
                modifier = Modifier.padding(horizontal = 16.dp),
                text = stringResource(R.string.add_settle_up_reminders),
                isChecked = true
            ) { }

            HintView(
                textValue = stringResource(
                    R.string.settle_up_reminder_msg,
                    stringResource(R.string.app_name)
                )
            )

        }

        ButtonApp(
            modifier
                .padding(16.dp)
                .align(Alignment.BottomCenter),
            text = stringResource(R.string.create)
        ) { }
    }
}

@Preview
@Composable
private fun CreateGroupScreenPreview() {
    CreateGroupScreen()
}