package com.mjalijani.splitwisely.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun Gap(sizeInDp: Int) {
    Spacer(Modifier.size(sizeInDp.dp))
}

