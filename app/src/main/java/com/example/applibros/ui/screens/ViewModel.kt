package com.example.applibros.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

sealed interface LibUiState {
    data class Success(val photos: String) : LibUiState
    object Error : LibUiState
    object Loading : LibUiState
}

class ViewModel : ViewModel() {

    var libUiState: LibUiState by mutableStateOf(LibUiState.Loading)
        private set



    fun getLibros() {
        viewModelScope.launch {

        }
    }
}