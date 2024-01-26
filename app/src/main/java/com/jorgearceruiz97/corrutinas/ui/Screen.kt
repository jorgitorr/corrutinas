package com.jorgearceruiz97.corrutinas.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun Screen(){
    var colorN by remember { mutableStateOf(Color.Blue) }
    Pantalla {
        colorN = if(colorN==Color.Blue){
            Color.Red
        }else{
            Color.Blue
        }
    }
}
@Composable
fun Pantalla(cambiarColor:()->Unit){
    var texto by remember { mutableStateOf("") }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Button(colors =ButtonDefaults.buttonColors(containerColor = Color.Blue), onClick = { cambiarColor }) {
            Text(text = "Cambiar color")
        }
        Text(text = texto)
        Button(colors =ButtonDefaults.buttonColors(containerColor = Color.Red), onClick = { texto = bloqueoApp() }) {
            Text(text = "Llamar API")
        }
    }
}


/**
 * suspende la ejecución del hilo actual
 */
fun bloqueoApp():String{
    Thread.sleep(5000)
    return "Respuesta de la API"
}