package com.example.cursobasicoandroid.features.imc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.cursobasicoandroid.features.imc.composables.CounterSelector
import com.example.cursobasicoandroid.features.imc.composables.GenderSelector
import com.example.cursobasicoandroid.features.imc.composables.HeightSelector

@Composable
fun ImcScreen (){

    var isMaleSelected by  remember{ mutableStateOf(false) }
    var height by remember { mutableStateOf(160f) }
    var weight by remember { mutableStateOf(80) }
    var age by remember { mutableStateOf(30) }

    Column (Modifier.fillMaxSize()){
        GenderSelector(
            isMaleSelected = isMaleSelected,
            onGenderSelected = { isMaleSelected = it }
        )
        HeightSelector(height, onHeightChange = {height = it} )
        CounterSelector(
            age = age,
            onPlusAgeSelected = {age++},
            onMinusAgeSelected = {age--},
            weight = weight,
            onPlusWeightSelected = {weight++},
            onMinusWeightSelected = {weight--}
        )
    }

}