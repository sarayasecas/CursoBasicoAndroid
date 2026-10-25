package com.example.cursobasicoandroid.features.imc.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cursobasicoandroid.ui.theme.ButtonColor
import com.example.cursobasicoandroid.ui.theme.ButtonTextColor
import com.example.cursobasicoandroid.ui.theme.UnselectedCard

@Composable
fun CounterSelector(
    age: Int,
    weight: Int,
    onPlusAgeSelected: () -> Unit,
    onMinusAgeSelected: () -> Unit,
    onPlusWeightSelected: () -> Unit,
    onMinusWeightSelected: () -> Unit
){
    Row(Modifier
        .fillMaxWidth()
        .padding(16.dp), horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        CounterCard(
            modifier = Modifier.weight(1f),
            title = "Peso",
            value = weight,
            onPlus = {onPlusWeightSelected()},
            onMinus = {onMinusWeightSelected()})
        CounterCard(
            modifier = Modifier.weight(1f),
            title = "Edad",
            value = age,
            onPlus = {onPlusAgeSelected()},
            onMinus = {onMinusAgeSelected()})
    }

}
@Composable
fun CounterCard(
    modifier: Modifier = Modifier,
    title : String,
    value: Int,
    onMinus:() -> Unit,
    onPlus:() -> Unit
    ){

    Card(
        modifier
            .height(180.dp),
        colors = CardDefaults.cardColors(containerColor = UnselectedCard)
    ){
        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(title, fontSize = 18.sp, color = Color.White)
            Spacer(Modifier.height(8.dp)
            )
            Text(value.toString(), fontSize = 48.sp, fontWeight = FontWeight.Bold,
                color = Color.White)
            Spacer(Modifier.height(8.dp)
            )
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Button(
                    onClick = {onMinus() },
                    modifier = Modifier.size(42.dp),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = ButtonColor, contentColor = ButtonTextColor)) {
                    Text("-", fontSize = 32.sp)
                }
                Button(
                    onClick = {onPlus() },
                    modifier = Modifier.size(42.dp),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = ButtonColor, contentColor = ButtonTextColor)) {
                    Text("+", fontSize = 32.sp)
                }
            }
        }
    }
}

@Preview
@Composable
fun CounterCardPreview(){
    CounterCard(
        modifier = Modifier.width(200.dp),
       title = "PESO",
        value = 80,
        onPlus = {},
        onMinus = {}
    )
}