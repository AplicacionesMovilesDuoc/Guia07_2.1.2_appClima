package com.mjperezm.guia07_212_appmoviles.viewmodel


import androidx.lifecycle.ViewModel
import com.mjperezm.guia07_212_appmoviles.model.WeatherData
import com.mjperezm.guia07_212_appmoviles.repository.WeatherRepository
import com.mjperezm.guia07_212_appmoviles.model.ForecastData

class WeatherViewModel : ViewModel() {
    private val repository = WeatherRepository()

    fun getWeather(city: String): WeatherData {
        return repository.getCurrentWeather(city)
    }

    fun getForecast(city: String): List<ForecastData> {
        return repository.getForecast(city)
    }
}