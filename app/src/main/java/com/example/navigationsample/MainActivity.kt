package com.example.navigationsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navigationsample.ui.theme.NavigationSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationSampleTheme {

            }
        }
    }
}


@Composable
fun Screen1(modifier: Modifier = Modifier) {
    var name by remember{ mutableStateOf("") }


    Column {
        Text(text = "Enter your name ")
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = name, onValueChange = { name = it})
        Button(onClick = { /*TODO*/ }) {
            
        }
    }
}

@Composable
@Preview(showBackground = true)
fun Screen1Preview(modifier: Modifier = Modifier) {
    Screen1()
}