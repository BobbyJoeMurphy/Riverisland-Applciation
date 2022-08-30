package com.example.riverislandapplication.Presentation.ItemDetailList

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.riverislandapplication.Data.remote.Dto.Product
import com.example.riverislandapplication.Presentation.ItemList.Components.itemListItem
import com.example.riverislandapplication.Presentation.Screen


@Composable
fun ItemDetailScreen(
    viewModel: ItemDetailViewModel = hiltViewModel()
) {
    val state = viewModel.state.value

    Box(modifier = Modifier.fillMaxSize()) {
        state.Item?.let { Item ->
            Text(
                text = Item.name
            )
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(20.dp)
            ) {
                item {
                    Column(
                        modifier = Modifier.fillMaxWidth(),

                    ) {
                        Text(
                            text = Item.prodid,
                            style = MaterialTheme.typography.h2,
                        )
                    }
                }


            }

            if (state.error.isNotBlank()) {
                Text(
                    text = state.error,
                    color = MaterialTheme.colors.error,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .align(
                            Alignment.Center
                        )


                )
            }

        }


    }
}

