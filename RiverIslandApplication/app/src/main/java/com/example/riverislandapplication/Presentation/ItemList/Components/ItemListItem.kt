package com.example.riverislandapplication.Presentation.ItemList.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest


import com.example.riverislandapplication.Data.remote.Dto.Product


@Composable
fun itemListItem(
    item: Product,
    onItemClick: (Product)-> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(item) }
            
    ) {
        Column(
            modifier = Modifier,
        ) {
            SubcomposeAsyncImage(
                modifier = Modifier
                    .height(250.dp),
                model = "https://images.riverisland.com/is/image/RiverIsland/${item.prodid}_main",
                contentScale = ContentScale.Crop,
                loading = {
                    CircularProgressIndicator()
                },
                contentDescription = ""
            )
            Spacer(modifier = Modifier

                .height(15.dp))
            Text(

                text = item.name.uppercase(),
                fontStyle = FontStyle.Italic,
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(7.dp)

            )
            Spacer(modifier = Modifier
                .height(7.dp)
            )
            Text(
                text = "£"+item.cost+".00",
                fontStyle = FontStyle.Italic,
                        fontSize = 11.sp,
                modifier = Modifier
                    .padding(7.dp)

            )
        }
    }



}