package com.iteneum.leasepert

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.iteneum.designsystem.theme.LeasePertTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LeasePertTheme {
                Text(text = "Prueba")
            }
        }
    }
}

