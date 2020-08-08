package com.example.coviduiandroidcompose.ui.components

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp
import com.example.coviduiandroidcompose.ui.deepBlue

@Preview(name = "Title")
@Composable
fun previewTitle() {
    Title(text = "Hola Ann")
}

@Composable
fun Title(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = deepBlue,
        fontSize = 24.sp,
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontWeight = FontWeight.Bold
        ),
        modifier = modifier
    )
}