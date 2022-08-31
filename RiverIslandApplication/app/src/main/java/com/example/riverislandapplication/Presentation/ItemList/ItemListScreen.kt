package com.example.riverislandapplication.Presentation.ItemList

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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

        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            Alignment.Center
                        ) {
                            Text(text = "Top App Bar")
                        }
                    },
                    navigationIcon = {
                        IconButton(onClick = {navController.navigate(Screen.HomeScreen.route)}) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Back"
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 10.dp)
                        .clip(shape = RoundedCornerShape(16.dp)),
                    elevation = 8.dp,
                    actions = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = null
                            )
                        }
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = null
                            )
                        }
                    }
                )
            }
        ) {
            LazyVerticalGrid(

                cells = GridCells.Fixed(2),
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

        }













