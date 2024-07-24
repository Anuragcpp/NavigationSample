package com.example.navigationsample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationsample.ui.theme.NavigationSampleTheme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationSampleTheme {
//                MyApp()
            }
        }
    }
}

//@Composable
//fun MyApp() {
//    val navController = rememberNavController()
//
//    NavHost(navController = navController, startDestination = Screen1Route ){
//        composable<Screen1Route> {
//            Screen1 {
//                navController.navigate(Screen2Route)
//            }
//        }
//
//        composable<Screen2Route> {
//            Screen2()
//        }
//    }
//}
//
//
//@Serializable
//class Screen1Route()
//
//@Serializable
//class Screen2Route()


