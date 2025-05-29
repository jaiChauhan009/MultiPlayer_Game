package com.example.multiplayer_game.android

class GamerModel(
    var currentPlayer: Status = Status.PlayerX,
    var winingPlayer: Status = Status.Empty,
    var isGamerEnding: Boolean = false,
) {}