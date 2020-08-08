package com.example.coviduiandroidcompose.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.Image
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.preferredHeightIn
import androidx.ui.res.imageResource
import androidx.ui.unit.dp

@Composable
fun ImageOnboarding(@DrawableRes idDrawableRes: Int) {
    val imageModifier = Modifier.preferredHeightIn(350.dp).fillMaxWidth()
    Image(
        asset = imageResource(idDrawableRes),
        modifier = imageModifier,
        contentScale = ContentScale.Fit
    )
}