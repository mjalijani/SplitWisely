package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.PrimaryText
import com.mjalijani.splitwisely.ui.theme.SecondaryText

@Composable
fun CustomAlertDialog(
    showDialog: Boolean,
    title: String,
    text: String,
    confirmText: String,
    cancelText: String,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit,
    onDismissButton: () -> Unit = {}
) {
    if (showDialog) {
        AlertDialog(
            shape = RoundedCornerShape(corner = CornerSize(8.dp)),
            onDismissRequest = onDismiss,
            title = { TextApp(title, textColor = PrimaryText) },
            text = { TextApp(text, textColor = SecondaryText) },
            confirmButton = {
                TextApp(
                    modifier =
                    Modifier.clickable {
                        onConfirm.invoke()
                    },
                    text = confirmText,
                    textColor = Color.Black
                )
            },
            dismissButton = {
                TextApp(
                    modifier =
                    Modifier.clickable {
                        onDismissButton.invoke()
                    },
                    text = cancelText,
                    textColor = Color.Black
                )
            }
        )
    }
}

@Preview
@Composable
private fun CustomAlertDialogPreview() {
    CustomAlertDialog(
        showDialog = true,
        onDismiss = { },
        title = stringResource(R.string.title),
        text = stringResource(R.string.description),
        onConfirm = { },
        onDismissButton = { },
        confirmText = stringResource(R.string.confirm),
        cancelText = stringResource(R.string.cancel)
    )
}