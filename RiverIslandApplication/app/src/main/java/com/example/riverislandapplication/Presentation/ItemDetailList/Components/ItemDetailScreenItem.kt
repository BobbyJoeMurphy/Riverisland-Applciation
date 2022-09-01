package com.example.riverislandapplication.Presentation.ItemDetailList.Components


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.riverislandapplication.Data.remote.Dto.Product
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.lang.Math.abs

@Composable
fun ItemDetailScreenItem(
    navController: NavController,
    item: Product) {

    val itemParentImageIndex = remember{
        mutableStateOf(0)
    }






    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
          LazyColumn(Modifier.fillMaxHeight()

          ) {

              item {
                  AsyncImage(
                      model = ImageRequest.Builder(LocalContext.current)
                          .data(item.allImages[itemParentImageIndex.value])
                          .crossfade(true)
                          .build(),
                      contentDescription = " stringResource(R.string.description)",
                      contentScale = ContentScale.Crop,
                      modifier = Modifier
                          .fillParentMaxSize()

                  )
              }







              item {
                  Column (modifier = Modifier.padding(16.dp,0.dp)){


                      Spacer(modifier = Modifier.height(16.dp))

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
                      Text(

                          text = "Item sizes :" + item.sizes,
                          fontSize = 15.sp
                      )
                      Spacer(modifier = Modifier.height(5.dp))
                      Text(

                          text = "Item sizes :" + item.sizes,
                          fontSize = 15.sp
                      )
                      Spacer(modifier = Modifier.height(90.dp))
                  }
              }
          }
        IconButton(onClick = {navController.navigateUp()},
        Modifier.padding(9.dp,4.dp)) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
            )
        }
              }


}



