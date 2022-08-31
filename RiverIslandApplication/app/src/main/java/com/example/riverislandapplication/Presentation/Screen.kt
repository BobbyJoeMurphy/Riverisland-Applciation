package com.example.riverislandapplication.Presentation

sealed class Screen(val route:String){
    object ItemListScreen:Screen("Item_List_Screen")
    object ItemDetailScreen:Screen("Item_Detail_Screen")
    object HomeScreen:Screen("Home_Screen")
}
