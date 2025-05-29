package com.example.multiplayer_game.android

enum class Status {
    Empty,
    PlayerX,
    PlayerO;

    fun next(): Status {
        if (this.ordinal == PlayerX.ordinal) {
            return PlayerO
        }

        return PlayerX
    }
}