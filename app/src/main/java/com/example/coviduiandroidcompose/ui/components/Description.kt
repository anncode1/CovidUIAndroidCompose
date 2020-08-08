package com.example.coviduiandroidcompose.ui.components

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp
import com.example.coviduiandroidcompose.getDescription
import com.example.coviduiandroidcompose.ui.regularBlue

@Preview(name = "Description")
@Composable
fun previewDescription() {
    Description(text = getDescription())
}

@Composable
fun Description(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = regularBlue,
        fontSize = 15.sp,
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}