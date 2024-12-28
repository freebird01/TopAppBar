package com.example.topappbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.topappbar.ui.theme.TopAppBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TopAppBarTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TopAppBarExample(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarExample(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar(
            title = {
                Text(
                    text = "Page Title",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(start = 30.dp)
                )
            },
//            modifier = Modifier.width(300.dp),
            navigationIcon = {
                Image(
                    painter = painterResource(R.drawable.navigation_icon),
                    contentDescription = ""
                )
            },
            actions = {
                IconButton(onClick = {}) {
                    Image(
                        painter = painterResource(R.drawable.favorite_icon),
                        contentDescription = ""
                    )
                }
                IconButton(onClick = {}) {
                    Image(
                        painter = painterResource(R.drawable.search_icon),
                        contentDescription = ""
                    )
                }
                IconButton(onClick = {}) {
                    Image(
                        painter = painterResource(R.drawable.overflow_menu_icon),
                        contentDescription = ""
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(Color(0xFF5F3C9C))

        )
//        Row {
//            Text(text = "Page Title")
//        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TopAppBarTheme {
        TopAppBarExample("Android")
    }
}