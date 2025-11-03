# Guia07_2.1.2_appClima

Nombre del Proyecto: AppClima_Grupo6
Tema: Aplicación móvil del clima
Alcance: App para consultar clima actual y pronóstico
Plataforma: Android con Jetpack Compose

Se ha completado exitosamente la Guía 7, configurando un proyecto de aplicación móvil del clima utilizando el patrón arquitectónico MVVM en Android Studio con Jetpack Compose.

# 1.1 Requerimientos Definidos
✅ Pantalla principal con clima actual

✅ Pronóstico extendido (5 días)

✅ Búsqueda por ciudad

✅ Datos en tiempo real mediante API

✅ Interfaz en español

# 1.2 Tecnologías Implementadas

Android Studio + Jetpack Compose
Patrón MVVM (Model-View-ViewModel)
Kotlin como lenguaje principal
API OpenWeatherMap (planificado)

# 2.Estructura de Carpetas Creada
app/src/main/java/com/mjperezm/guia07_212_appmoviles/
├── 📁 ui/
│   ├── 📁 screens/
│   │   └── ✅ WeatherScreen.kt
│   └── 📁 theme/
│       ├── ✅ Theme.kt
│       ├── ✅ Color.kt
│       └── ✅ Type.kt
├── 📁 viewmodel/
│   └── ✅ WeatherViewModel.kt
├── 📁 model/
│   ├── ✅ WeatherData.kt
│   └── ✅ ForecastData.kt
└── 📁 repository/
└── ✅ WeatherRepository.kt



# 2.1 Clases y Componentes Implementados

*Model (Datos)
WeatherData.kt: Modelo para datos del clima actual
ForecastData.kt: Modelo para pronóstico extendido

*Repository
WeatherRepository.kt: Simulación de datos climáticos (listo para conectar API real)

*ViewModel
WeatherViewModel.kt: Gestión del estado de la UI y lógica de presentación

*UI (Screens)
WeatherScreen.kt: Pantalla principal que 

muestra:
Ciudad actual
Temperatura en °C
Descripción del clima
Humedad
Velocidad del viento

# 3.1 Control de Versiones - GitHub
✅ Repositorio creado: AppClima_GrupoX (privado)

✅ Integración Git habilitada en Android Studio

✅ Primer commit realizado: "Initial commit"

✅ Estructura MVVM subida correctamente

✅ Permisos de acceso otorgados al instructor (public)