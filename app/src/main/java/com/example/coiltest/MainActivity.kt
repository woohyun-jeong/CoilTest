package com.example.coiltest

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import com.example.coiltest.ui.theme.CoilTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoilTestTheme {
                val localContext = LocalContext.current

                Column {
                    Button(onClick = {
                        startActivity(Intent(localContext, ImageLoadActivity::class.java))
                    }) {
                        Text(text = "이미지 로드 이동하기")
                    }
                }

            }
        }
    }
}