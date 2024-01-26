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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Screen(){
    Pantalla()
}
@Composable
fun Pantalla(){
    var _color by remember {
        mutableStateOf(Color.Blue)
    }
    
    var _texto by remember {
        mutableStateOf("")
    }

    var _cont by remember {
        mutableStateOf(0)
    }

    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Button(colors =ButtonDefaults.buttonColors(containerColor = _color),
            onClick = {
                _color = if(_color==Color.Blue){
                    Color.Red
                }else{
                    Color.Blue
                }
            }) {
            Text(text = "Cambiar color")

        }
        Text(color = Color.Black, text = _texto)
        Button(colors =ButtonDefaults.buttonColors(containerColor = Color.Red),
            onClick = { _cont += 1
                _texto = "Respuesta de la API $_cont" }) {
            Text(text = "Llamar API")
        }
    }
}


/**
 * suspende la ejecución del hilo actual
 */
@Composable
fun bloqueoApp():String{
    var _cont by remember {
        mutableStateOf(0)
    }
    Thread.sleep(5000)
    return "Respuesta de la API $_cont"
}