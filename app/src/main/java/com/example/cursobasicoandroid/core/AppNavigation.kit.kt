package com.example.cursobasicoandroid.core

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.cursobasicoandroid.features.MenuScreen
import com.example.cursobasicoandroid.features.imc.ImcResultScreen
import com.example.cursobasicoandroid.features.imc.ImcScreen

@Composable
fun AppNavigation(){

    val backStack = rememberNavBackStack(Menu)

    NavDisplay(backStack = backStack, entryProvider = entryProvider {
        entry<Menu>{
            MenuScreen(onIMCSelected = {backStack.add(IMC)})
        }
        entry<IMC>{
            ImcScreen(onResultSelected = {result -> backStack.add(IMCResult(result))})
        }

        entry <IMCResult> { data ->
            data.result
            ImcResultScreen(data.result,{backStack.removeLastOrNull()} )
        }

    })
}