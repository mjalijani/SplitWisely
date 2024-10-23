package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mjalijani.splitwisely.R
import com.mjalijani.splitwisely.ui.theme.Surface

@Composable
fun TextInputApp(
    modifier: Modifier = Modifier,
    textValue: String = "https://www.spliter.com/join/p12fsdJHRsb+3164154153",
    onValueChange: (String) -> Unit
) {
    val value by remember {
        mutableStateOf(textValue)
    }
    TextField(
        modifier = modifier
            .clip(shape = RoundedCornerShape(corner = CornerSize(8.dp)))
            .background(color = Surface),
        value = value,
        onValueChange = {
            onValueChange.invoke(it)
        }
    )
}

@Composable
fun OutLineTextFieldApp(
    textValue: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier
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
            val image = if (passwordVisible) R.drawable.ic_eye else R.drawable.ic_eye

            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(
                    painter = painterResource(image),
                    contentDescription = if (passwordVisible) "Hide password" else "Show password"
                )
            }
        },
        modifier = modifier
            .fillMaxWidth()
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
    OutLineTextFieldApp("", {}, "label")
}

@Preview
@Composable
fun AppTextInputPreview(modifier: Modifier = Modifier) {
    TextInputApp() {

    }
}