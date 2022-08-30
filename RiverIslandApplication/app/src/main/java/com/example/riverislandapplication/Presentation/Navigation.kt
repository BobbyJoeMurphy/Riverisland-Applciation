package com.example.riverislandapplication.Presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.riverislandapplication.Domain.Models.Item
import com.example.riverislandapplication.Presentation.ItemDetailList.ItemDetailScreen
import com.example.riverislandapplication.Presentation.ItemList.ItemListSceen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.ItemListScreen.route
    ) {
        composable(Screen.ItemListScreen.route) {
            ItemListSceen(navController = navController)
        }
        composable(Screen.ItemDetailScreen.route + "/{prodid}") {
            ItemDetailScreen()
        }
    }
}

