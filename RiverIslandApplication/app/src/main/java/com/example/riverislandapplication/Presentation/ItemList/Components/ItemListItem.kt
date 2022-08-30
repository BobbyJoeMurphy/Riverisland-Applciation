package com.example.riverislandapplication.Presentation.ItemList.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import coil.compose.rememberAsyncImagePainter


import com.example.riverislandapplication.Data.remote.Dto.Product



@Composable
fun itemListItem(
    item: Product,
    onItemClick: (Product)-> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(item) }
            .padding(20.dp),
    ){


        SubcomposeAsyncImage(model = item.allImages[0],
            loading = {
                CircularProgressIndicator()
            },
            contentDescription = "")
        Text(
            text ="${item.name}"
        )
        Text(
            text ="£"+"${item.cost}"
        )

    }


}