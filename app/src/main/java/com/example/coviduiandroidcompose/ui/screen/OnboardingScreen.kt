package com.example.coviduiandroidcompose.ui.screen

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxHeight
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.coviduiandroidcompose.R
import com.example.coviduiandroidcompose.getDescription
import com.example.coviduiandroidcompose.getTitle2
import com.example.coviduiandroidcompose.ui.components.ButtonPurple
import com.example.coviduiandroidcompose.ui.components.Description
import com.example.coviduiandroidcompose.ui.components.ImageOnboarding
import com.example.coviduiandroidcompose.ui.components.Title

@Preview
@Composable
fun previewOnboardingScreen() {
    OnboardingScreen {}
}

@Composable
fun OnboardingScreen(onNext: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxWidth().fillMaxHeight() + Modifier.padding(top = 100.dp, start = 25.dp, end = 25.dp)
    ) {
        ImageOnboarding(idDrawableRes = R.drawable.onboarding)
        Title(
            text = getTitle2(),
            modifier = Modifier.padding(horizontal = 50.dp, vertical = 10.dp)
        )
        Description(
                text = getDescription(),
                modifier = Modifier.padding(horizontal = 50.dp, vertical = 10.dp))
        ButtonPurple(
                onClick = onNext,
                text = "Siguiente",
                modifier = Modifier.fillMaxWidth() + Modifier.padding(horizontal = 10.dp, vertical = 40.dp)
        )
    }
}