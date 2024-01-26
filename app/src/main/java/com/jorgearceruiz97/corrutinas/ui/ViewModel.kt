package com.jorgearceruiz97.corrutinas.ui

import android.annotation.SuppressLint
import android.app.Application
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class BlackJackViewModel() {
    private val _color = mutableStateOf(Color.Blue)

    var _cont = mutableStateOf(0)


    // Expone el color como una propiedad de solo lectura
    val color: Color
        get() = _color.value

    // Método para cambiar el color
    fun setColor(newColor: Color) {
        _color.value = newColor
    }

}

