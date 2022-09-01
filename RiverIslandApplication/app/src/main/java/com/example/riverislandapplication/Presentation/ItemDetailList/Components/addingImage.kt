package com.example.riverislandapplication.Presentation.ItemDetailList.Components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.example.riverislandapplication.Data.remote.Dto.Product

@Composable
fun addingImage(
    item: Product
) {
    SubcomposeAsyncImage(
        modifier = Modifier
            .height(900.dp),
        contentScale = ContentScale.Crop,
        model = item.allImages[0],
        loading = {
            CircularProgressIndicator()
        },
        contentDescription = "",
    )


    Column(
        modifier = Modifier
            .padding(15.dp)
    ) {
        Text(
            text = item.name.uppercase(),
            style = TextStyle(fontSize = 28.sp),
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "£" + item.cost + ".00",
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(53.dp))
        Text(

            text = "Item sizes :" + item.sizes,
            fontSize = 15.sp
        )
        Spacer(modifier = Modifier.height(5.dp))
    }
}

