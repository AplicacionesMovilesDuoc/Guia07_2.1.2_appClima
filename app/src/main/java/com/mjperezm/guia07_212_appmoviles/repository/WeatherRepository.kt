package com.mjperezm.guia07_212_appmoviles.repository

import com.mjperezm.guia07_212_appmoviles.model.WeatherData
import com.mjperezm.guia07_212_appmoviles.model.ForecastData

class WeatherRepository {
    // Por ahora simulamos datos, luego conectaremos API real
    fun getCurrentWeather(city: String): WeatherData {
        return WeatherData(
            city = city,
            temperature = 22.5,
            description = "Soleado",
            humidity = 65,
            windSpeed = 5.2
        )
    }

    fun getForecast(city: String): List<ForecastData> {
        return listOf(
            ForecastData("Hoy", 22.5, "Soleado"),
            ForecastData("Mañana", 24.0, "Parcialmente nublado"),
            ForecastData("Post-mañana", 20.0, "Lluvioso")
        )
    }
}