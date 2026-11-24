package com.example.applibros.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.applibros.R

@Composable
fun Pantallas(
    libUiState: LibUiState,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    when (libUiState) {
        is LibUiState.Loading -> LoadingScreen(modifier = modifier.fillMaxSize())
        is LibUiState.Success -> ResultScreen(
             modifier = modifier.fillMaxWidth()
        )
        is LibUiState.Error -> ErrorScreen( modifier = modifier.fillMaxSize())
    }
}

@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.cargando)
    )
}

@Composable
fun ErrorScreen(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.error)
    )
}

@Composable
fun ResultScreen(modifier: Modifier = Modifier) {
    Text(text = "hola")

}