package com.example.cursobasicoandroid.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.cursobasicoandroid.R


@Preview()
@Composable
fun ImageExample(){
    Column {
        Image(
            painter = painterResource(id = R.drawable.github),
            contentDescription = "Logo de GitHub"
        )
        Text(text = "Hola mundo")
    }
}

