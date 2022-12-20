package com.example.mykmmapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform