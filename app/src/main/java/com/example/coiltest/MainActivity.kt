package com.example.coiltest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.coiltest.ui.theme.CoilTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoilTestTheme {
                val scrollState = rememberScrollState() // ScrollState에 대한 remember

                Column (Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState))   {
                    AsyncImage(
                        modifier = Modifier.fillMaxWidth().height(600.dp),
                        model = "https://images.pexels.com/photos/2253105/pexels-photo-2253105.jpeg",
                        contentDescription = null,
                    )
                    AsyncImage(
                        modifier = Modifier.fillMaxWidth().height(600.dp),
                        model = "https://images.pexels.com/photos/1672121/pexels-photo-1672121.jpeg",
                        contentDescription = null,
                    )
                    AsyncImage(
                        modifier = Modifier.fillMaxWidth().height(600.dp),
                        model = "https://images.pexels.com/photos/3540545/pexels-photo-3540545.jpeg",
                        contentDescription = null,
                    )
                    AsyncImage(
                        modifier = Modifier.fillMaxWidth().height(600.dp),
                        model = "https://images.pexels.com/photos/5077805/pexels-photo-5077805.jpeg",
                        contentDescription = null,
                    )
                    AsyncImage(
                        modifier = Modifier.fillMaxWidth().height(600.dp),
                        model = "https://images.pexels.com/photos/3585072/pexels-photo-3585072.jpeg",
                        contentDescription = null,
                    )
                }
            }
        }
    }
}