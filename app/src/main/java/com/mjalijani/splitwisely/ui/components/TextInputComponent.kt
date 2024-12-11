package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.helper.SimpleCallBack
import com.mjalijani.splitwisely.helper.StringCallBack
import com.mjalijani.splitwisely.ui.theme.Surface
import com.mjalijani.splitwisely.ui.theme.ThirdText

@Composable
fun TextInputApp(
    modifier: Modifier = Modifier,
    textValue: String = "",
    placeHolder: String = "",
    textColor: Color = ThirdText,
    placeHolderColor: Color = ThirdText,
    trailingIcon: @Composable SimpleCallBack? = null,
    leadingIcon: SimpleCallBack? = null,
    onValueChange: StringCallBack
) {
    val value by remember {
        mutableStateOf(textValue)
    }
    TextField(
        modifier = modifier
            .clip(shape = RoundedCornerShape(corner = CornerSize(8.dp)))
            .background(color = Surface),
        value = value,
        placeholder = { TextApp(text = placeHolder, textColor = placeHolderColor) },
        onValueChange = {
            onValueChange.invoke(it)
        },
        trailingIcon = {
            trailingIcon?.invoke()
        },
        leadingIcon = {
            leadingIcon?.invoke()
        },
        colors = TextFieldDefaults.colors(
            focusedTextColor = textColor,
            unfocusedTextColor = textColor,
            unfocusedPlaceholderColor = placeHolderColor,
            focusedPlaceholderColor = placeHolderColor,
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
        )
    )
}

@Composable
fun OutLineTextFieldApp(
    textValue: String,
    label: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit,
) {
    val text by remember { mutableStateOf(textValue) }

    OutlinedTextField(
        value = text,
        onValueChange = { onValueChange.invoke(it) },
        label = { Text(label) },
        modifier = modifier
            .fillMaxWidth()
    )
}

@Composable
fun PasswordOutLineTextFieldApp(
    textValue: String,
    onValueChange: (String) -> Unit,
    onPassVisible: Boolean,
    modifier: Modifier = Modifier
) {
    val text by remember { mutableStateOf(textValue) }
    var passwordVisible by remember { mutableStateOf(onPassVisible) }

    OutlinedTextField(
        value = text,
        onValueChange = { onValueChange.invoke(it) },
        label = { Text("Password") },
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            val image = if (passwordVisible) R.drawable.eye_slash else R.drawable.ic_eye
            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(
                    painter = painterResource(image),
                    contentDescription = stringResource(if (passwordVisible) R.string.hide_password else R.string.show_password)
                )
            }
        },
        modifier = modifier
            .fillMaxWidth()
    )
}

@Composable
fun HintView(modifier: Modifier = Modifier, textValue: String) {
    TextApp(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Surface)
            .padding(16.dp),
        text = textValue,
        textColor = ThirdText
    )
}

@Preview
@Composable
private fun HintPreview() {
    HintView(
        textValue = stringResource(
            R.string.settle_up_reminder_msg,
            stringResource(R.string.app_name)
        )
    )
}

@Preview
@Composable
private fun PasswordOutLineTextFieldAppPreview() {
    PasswordOutLineTextFieldApp("", {}, true)
}

@Preview
@Composable
private fun OutLineTextFieldAppPreview() {
    OutLineTextFieldApp("", "label") {}
}

@Preview
@Composable
fun TextInputAppPreview(modifier: Modifier = Modifier) {
    TextInputApp() {

    }
}