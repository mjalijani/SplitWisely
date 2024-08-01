package com.mjalijani.splitwisely.ui.friends.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mjalijani.splitwisely.ui.theme.LightError
import com.mjalijani.splitwisely.ui.theme.LightSuccess
import com.mjalijani.splitwisely.ui.theme.OweBackgroundColor

@Composable
internal fun FriendsOverallComponent(
    modifier: Modifier = Modifier,
    oweValue: String,
    owedValue: String
) {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Absolute.SpaceBetween) {
        OweCard(title = "Owe You", amount = "$14,000", amountTextColor = LightSuccess)
        OweCard(title = "You Owe", amount = "$20,000", amountTextColor = LightError)
    }
}

@Composable
fun OweCard(modifier: Modifier = Modifier, title: String, amount: String, amountTextColor: Color) {
    Column(
        modifier = modifier
            .clip(shape = RoundedCornerShape(10.dp))
            .background(color = OweBackgroundColor)
            .padding(vertical = 10.dp, horizontal = 50.dp)
    ) {
        Text(text = title)
        Spacer(Modifier.size(10.dp))
        Text(text = amount, color = amountTextColor, fontWeight = FontWeight.Bold, fontSize = 20.sp)
    }
}

@Preview
@Composable
private fun FriendsOverallComponentPreview() {
    FriendsOverallComponent(oweValue = "34,000", owedValue = "234,42343")
}