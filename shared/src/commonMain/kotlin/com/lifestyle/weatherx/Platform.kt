package com.lifestyle.weatherx

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform