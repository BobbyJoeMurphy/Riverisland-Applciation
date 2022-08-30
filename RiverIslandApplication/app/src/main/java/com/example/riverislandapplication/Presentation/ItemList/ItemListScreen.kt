package com.example.riverislandapplication.Presentation.ItemList

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.riverislandapplication.Presentation.ItemList.Components.itemListItem
import com.example.riverislandapplication.Presentation.Screen


@Composable
fun ItemListSceen(
    navController: NavController,
    viewModel: ItemListViewModel = hiltViewModel()
)
{
    val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxWidth()){
        LazyColumn(modifier = Modifier.fillMaxSize()){
            //madesure items is a list not singular
            items(state.Items){
                item->
                itemListItem(
                    item = item,
                    onItemClick = {
                        navController.navigate(Screen.ItemDetailScreen.route + "/${item.prodid}")
                    }
                )




            }
        }
        if(state.error.isNotBlank()){
            Text(
                text = state.error,
                color = MaterialTheme.colors.error,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .align(
                        Alignment.Center)
                    

            )
        }

    }


}