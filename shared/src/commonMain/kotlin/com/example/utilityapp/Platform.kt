package com.example.utilityapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform