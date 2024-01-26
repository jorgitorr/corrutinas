package com.jorgearceruiz97.corrutinas.corrutinas.ui

import  androidx.compose.foundation.layout.Arrangement
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
import androidx.lifecycle.ViewModel


@Composable
fun Pantalla(viewModel:viewModelPrincipal){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Button(colors =ButtonDefaults.buttonColors(containerColor = viewModel._color ),
            onClick = {
                viewModel.cambiarColor()
            }) {
            Text(text = "Cambiar color")

        }
        Text(color = Color.Black, text = viewModel._texto)
        Button(colors =ButtonDefaults.buttonColors(containerColor = Color.Red),
            onClick = { viewModel.bloqueoApp() }) {
            Text(text = "Llamar API")
        }
    }
}
