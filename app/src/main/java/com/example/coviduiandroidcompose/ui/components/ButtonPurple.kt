package com.example.coviduiandroidcompose.ui.components

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.InnerPadding
import androidx.ui.material.Button
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.coviduiandroidcompose.ui.purple500

@Preview
@Composable
fun previewButton() {
    ButtonPurple(text = "Siguiente", onClick = {})
}

@Composable
fun ButtonPurple(onClick: () -> Unit, text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        text = { Text(text = text)},
        modifier = modifier,
        backgroundColor = purple500,
        contentColor = Color.White,
        elevation = 1.dp,
        shape = RoundedCornerShape(50),
        padding = InnerPadding(18.dp)
    )
}