package com.example.multiplayer_game.android.screenUtil

import kotlin.random.Random

enum class GameStatus {
    CREATED,
    JOINED,
    INPROGRESS,
    FINISHED
}


data class TicToeGameModel (
    var users : MutableList<String> = mutableListOf(),
    var gameId : String = "-1",
    var filledPos : MutableList<String> = mutableListOf("","","","","","","","",""),
    var winner : String ="",
    var gameStatus : GameStatus = GameStatus.CREATED,
    var currentPlayer : String = (arrayOf("X","O"))[Random.nextInt(2)]
)

data class MatchingCardModel (
    var users : MutableList<String> = mutableListOf(),
    var gameId : String = "-1",
    var notMatchedCard:MutableList<Model> = mutableListOf(),
    var userCard:MutableMap<String, List<Model>> = mutableMapOf(),
    var winner : String ="",
    var currentTurn:MutableMap<String,Model> = mutableMapOf(),
    var gameStatus: GameStatus = GameStatus.CREATED,
    var currentPlayer : String = users[Random.nextInt(until = 2)]
)