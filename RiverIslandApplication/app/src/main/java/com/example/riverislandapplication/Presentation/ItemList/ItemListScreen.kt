package com.example.riverislandapplication.Presentation.ItemList

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.riverislandapplication.Presentation.ItemList.Components.itemListItem
import com.example.riverislandapplication.Presentation.Screen


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ItemListSceen(
    navController: NavController,
    viewModel: ItemListViewModel = hiltViewModel()
) {
    val state = viewModel.state.value

LazyVerticalGrid(cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(1.dp),
    verticalArrangement = Arrangement.spacedBy(15.dp),
    horizontalArrangement = Arrangement.spacedBy(2.dp),
    ) {

    items(state.Items) { item ->
        itemListItem(
            item = item,
            onItemClick = {
                navController.navigate(Screen.ItemDetailScreen.route + "/${item.prodid}")
            }
        )
    }
}



}



