package com.jorgearceruiz97.corrutinas.corrutinas.ui

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class viewModelPrincipal:ViewModel() {
    var _color by mutableStateOf(Color.Blue)
    var _texto by mutableStateOf("")
    var _cont by mutableStateOf(0)
    var isLoading by mutableStateOf(false)


    fun cambiarColor(){
        if(_color==Color.Blue)_color = Color.Red else _color = Color.Blue
    }

    fun fetchData() {
        //Nos permite crear una corrutina desde un ViewModel
        viewModelScope.launch {
            try {
                isLoading = true
                llamarApi()
            } catch (e: Exception) {
                println("Error ${e.message}")
            } finally {
                isLoading = false
            }
        }
    }


    private suspend fun llamarApi() {
        _cont = _cont.plus(1)
        val result = withContext(Dispatchers.IO) {
            delay(5000)
            _texto = "Respuesta de la API $_cont"
        }
    }





}

