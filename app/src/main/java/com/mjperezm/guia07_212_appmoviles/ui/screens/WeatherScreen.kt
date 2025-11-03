package com.mjperezm.guia07_212_appmoviles.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mjperezm.guia07_212_appmoviles.viewmodel.WeatherViewModel

@Composable
fun WeatherScreen() {
    val viewModel = WeatherViewModel()
    var city by remember { mutableStateOf("Santiago") }
    val weather = viewModel.getWeather(city)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Clima en ${weather.city}",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "${weather.temperature}°C",
            style = MaterialTheme.typography.displayMedium
        )

        Text(
            text = weather.description,
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text("Humedad: ${weather.humidity}%")
        Text("Viento: ${weather.windSpeed} km/h")
    }
}