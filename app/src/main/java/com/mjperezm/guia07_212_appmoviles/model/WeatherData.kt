package com.mjperezm.guia07_212_appmoviles.model


data class WeatherData(
    val city: String,
    val temperature: Double,
    val description: String,
    val humidity: Int,
    val windSpeed: Double
)

