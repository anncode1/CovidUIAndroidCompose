package com.example.coviduiandroidcompose

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp
import com.example.coviduiandroidcompose.ui.CovidUIAndroidComposeTheme
import com.example.coviduiandroidcompose.ui.components.Title
import com.example.coviduiandroidcompose.ui.deepBlue
import com.example.coviduiandroidcompose.ui.screen.OnboardingScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnboardingScreen {
                Toast.makeText(this, "Siguiente Pantalla", Toast.LENGTH_LONG).show()
            }
        }
    }

}

fun getTitle2(): String = "Frenemos la pandemia juntos"
fun getDescription(): String = "Te ayudamos a prevenir el COVID19 con estos tips"
