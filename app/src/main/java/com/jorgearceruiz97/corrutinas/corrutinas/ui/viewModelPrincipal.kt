package com.jorgearceruiz97.corrutinas.corrutinas.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color


class viewModelPrincipal {
    var _color by mutableStateOf(Color.Blue)
    var _texto by mutableStateOf("")
    var _cont by mutableStateOf(0)


    fun cambiarColor(){
        if(_color==Color.Blue){
            Color.Red
        }else{
            Color.Blue
        }
    }

    /**
     * suspende la ejecución del hilo actual
     */
    fun bloqueoApp():Int{
        _cont++
        Thread.sleep(5000)
        return _cont
    }

}

