package com.mjalijani.splitwisely.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.mjalijani.splitwisely.R

@Composable
fun AnimationViewApp(fileAnimation: Int, modifier: Modifier = Modifier, iterations: Int = 1) {

    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(fileAnimation))
    val progress by animateLottieCompositionAsState(
        composition,
        iterations = iterations
    )

    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = modifier
    )
}

@Preview
@Composable
private fun AnimationViewAppPreview() {
    AnimationViewApp(R.raw.chain)
}