package com.example.cursobasicoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cursobasicoandroid.composables.ButtonExample
import com.example.cursobasicoandroid.composables.CounterScreen
import com.example.cursobasicoandroid.composables.ImageExample
import com.example.cursobasicoandroid.composables.ListExample
import com.example.cursobasicoandroid.composables.ProfileScreen
import com.example.cursobasicoandroid.composables.TextExample
import com.example.cursobasicoandroid.composables.TextFieldExample
import com.example.cursobasicoandroid.core.AppNavigation
import com.example.cursobasicoandroid.features.MenuScreen
import com.example.cursobasicoandroid.ui.theme.CursoBasicoAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CursoBasicoAndroidTheme() {
                AppNavigation()
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun Example(){
    Text(text = "Hola, es una prueba", fontSize = 40.sp)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CursoBasicoAndroidTheme {
        Greeting("Android")
    }
}

