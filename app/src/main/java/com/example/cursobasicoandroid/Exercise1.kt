package com.example.cursobasicoandroid

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Exercise1(){
    Column(modifier = Modifier.fillMaxHeight()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Cyan),
        contentAlignment = Alignment.Center
        )
        {
            Text("Ejemplo1")
        }
        Box(modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Red))
        Box(modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Magenta))
    }
}