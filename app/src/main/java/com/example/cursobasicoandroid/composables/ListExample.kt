package com.example.cursobasicoandroid.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ListExample(modifier: Modifier = Modifier){

    val names = listOf(
        "Saray", "Dani", "Moni", "Patri", "Marisol", "Saray", "Dani", "Moni", "Patri", "Marisol", "Saray", "Dani", "Moni", "Patri", "Marisol", "Saray", "Dani", "Moni", "Patri", "Marisol","Saray", "Dani", "Moni", "Patri", "Marisol","Saray", "Dani", "Moni", "Patri", "Marisol","Saray", "Dani", "Moni", "Patri", "Marisol"
    )

    LazyColumn(modifier = modifier) {
        item {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color(0xA1B27DE1)),
                contentAlignment = Alignment.Center
            ){
                Text("Titulo")
            }
        }
        items(names){
            Text(it)
        }
    }
}
