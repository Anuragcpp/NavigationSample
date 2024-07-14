package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Screen1(modifier: Modifier = Modifier) {
    var name by remember{ mutableStateOf("") }


    Column(modifier = modifier
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Enter your name ")
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = name, onValueChange = { name = it})
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Go to the second screen")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun Screen1Preview(modifier: Modifier = Modifier) {
    Screen1()
}