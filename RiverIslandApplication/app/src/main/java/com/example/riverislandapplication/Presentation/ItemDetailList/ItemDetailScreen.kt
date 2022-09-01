package com.example.riverislandapplication.Presentation.ItemDetailList


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.riverislandapplication.Presentation.ItemDetailList.Components.AddToBagBox
import com.example.riverislandapplication.Presentation.ItemDetailList.Components.ItemDetailScreenItem


@Composable
fun ItemDetailScreen(
    navController: NavController,
    viewModel: ItemDetailViewModel = hiltViewModel()
) {
    val state = viewModel.state.value

        state.Item?.let { Item ->
            ItemDetailScreenItem(
                item = Item,
                navController = navController
            )
        }

    AddToBagBox()
    }














