package com.example.riverislandapplication.Presentation.ItemDetailList.Components

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.example.riverislandapplication.Data.remote.Dto.Product

@Composable
fun ItemDetailScreenItem(
    item: Product){
    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        LazyColumn(
            Modifier
                .align(Alignment.Center)
                .fillMaxWidth()

        ) {
            item {
                SubcomposeAsyncImage(
                    modifier = Modifier
                        .height(500.dp),
                    contentScale = ContentScale.Crop,
                    model = item.allImages[0],
                    loading = {
                        CircularProgressIndicator()
                    },
                    contentDescription = "",
                    )


                Column( modifier = Modifier
                    .padding(15.dp)
                ) {


                    Text(

                        text = item.name.uppercase(),
                        style = TextStyle(fontSize = 28.sp) ,

                        )
                    Spacer(modifier = Modifier.height(15.dp))

                    Text(

                        text = "£" + item.cost + ".00",
                        fontSize =18.sp
                    )
                    Spacer(modifier = Modifier.height(53.dp))
                    Text(

                        text = "Item sizes :"+item.sizes,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                }


            }
        }

    }


}
