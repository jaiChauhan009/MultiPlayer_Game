package com.example.multiplayer_game.android

import android.app.Activity
import androidx.compose.runtime.Composable


@Composable
fun JoinGame(activity: Activity, navController: NavController){
    NavHost(navController = navController as NavHostController, startDestination = "MainScreen"){
        composable("CardGame"){
            CardGameJoin(activity = activity,navController)
        }
        composable("MainScreen"){
            MainScreen(activity = activity,navController)
        }
        composable("MatchingCard"){
            MatchingCard(activity,navController)
        }
        composable("TicToe"){
            TicToeGameJoin(activity = activity,navController)
        }
        composable("GuessCard"){
            CardGuessGameJoin(activity = activity,navController)
        }
        composable("more"){
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center){
                Text(text = "More Game")
            }
        }
        composable("playCard"){
            val name = it.arguments?.getString("name")?:""
            PlayCard(name,navController)
        }
        composable("playTicToe"){
            PlayTicToe()
        }
        composable("playMatchingCard"){
            val name = it.arguments?.getString("name")?:""
            PlayMatchingCard(name)
        }
        composable("playGuessCard"){
            PlayGuessCard()
        }
    }
}