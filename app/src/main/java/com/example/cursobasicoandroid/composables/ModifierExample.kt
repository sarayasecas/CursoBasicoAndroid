package com.example.cursobasicoandroid.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ProfileScreen(){
    Row(modifier = Modifier
        .fillMaxHeight()
        .background(Color.Red)
        .padding(horizontal = 22.dp, vertical = 40.dp)
    ){
        Column (modifier = Modifier.background(Color.Blue)){
            Text("Saray", color = Color.White)
            Text("Gestora en crisis")

    }
        Button(onClick ={}){
            Text("Follow")
        }
    }

}