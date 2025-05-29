package com.example.multiplayer_game

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform