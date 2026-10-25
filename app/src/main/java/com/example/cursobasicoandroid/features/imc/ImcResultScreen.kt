package com.example.cursobasicoandroid.features.imc

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImcResultScreen(result: Float, onBackSelected:() -> Unit){

    val category = getBmiCategory(result)
    val description = getBmiDescription(result)
    val color = getBmiColor(result)

    Scaffold(
        topBar =  { TopAppBar(title = {Text("Analizando:") }) }) { paddingValues ->
        Column(
            modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(16.dp))
        {
            Text("Tu Resultado:", fontSize = 48.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(32.dp))
            Card(
                modifier = Modifier.fillMaxWidth().weight(1f)
            ) {
                Column(Modifier.fillMaxSize().padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        category, color = color,
                        fontSize = 28.sp, fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center)
                    Text(
                        String.format("%.2f",result), color = color,
                        fontSize = 28.sp, fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center)
                    Text(
                        description, color = color,
                        fontSize = 24.sp, fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center)
                }
            }
            Spacer(Modifier.height(32.dp))
            Button(onClick = { onBackSelected() },modifier = Modifier.fillMaxWidth().height(60.dp)){
                Text("Recalcular", fontSize = 28.sp)
            }
            Spacer(Modifier.height(16.dp))
        }

    }
}

fun getBmiCategory(bmi: Float): String {
    return when{
        bmi < 18.5f -> "Bajo peso"
        bmi < 25f -> "Normal"
        bmi < 30f -> "Sobrepeso"
        else -> "Obesidad"
    }
}
fun getBmiDescription(bmi: Float): String {
    return when{
        bmi < 18.5f -> "Estás por debajo del peso recomendado"
        bmi < 25f -> "Estás en lo óptimo. Titán, Mastodonte, Velociraptor, Jabali."
        bmi < 30f -> "Empieza a caminar, coleguita"
        else -> "Quizás ese tercer paquete de oreos no es necesario."
    }
}
fun getBmiColor(bmi: Float): Color {
    return when{
        bmi < 18.5f -> Color(0xF555B9B0)
        bmi < 25f -> Color(0xF7449822)
        bmi < 30f -> Color(0xFFFF9800)
        else -> Color(0xFFE71616)
    }
}