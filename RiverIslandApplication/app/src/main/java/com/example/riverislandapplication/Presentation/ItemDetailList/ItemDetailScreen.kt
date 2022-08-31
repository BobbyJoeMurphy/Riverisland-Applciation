package com.example.riverislandapplication.Presentation.ItemDetailList


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.riverislandapplication.Presentation.ItemDetailList.Components.AddToBagBox
import com.example.riverislandapplication.Presentation.ItemDetailList.Components.ItemDetailScreenItem


@Composable
fun ItemDetailScreen(
    viewModel: ItemDetailViewModel = hiltViewModel()
) {
    val state = viewModel.state.value



    Row {
        state.Item?.let { Item ->
            ItemDetailScreenItem(
                item = Item,
            )
        }
    }
    AddToBagBox()





}











