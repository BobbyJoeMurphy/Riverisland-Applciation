package com.example.riverislandapplication.Presentation.HomeScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavController
import coil.compose.SubcomposeAsyncImage
import com.example.riverislandapplication.Presentation.Screen


@Composable
fun HomeScreenViewModel (
    navController: NavController
) {
    Box(
        modifier = Modifier

    ){
        Column(
            modifier = Modifier.fillMaxSize()



        ) {

            SubcomposeAsyncImage(
                model = "https://images.riverisland.com/is/image/RiverIsland/766200_main",
                contentDescription = "sss",
                contentScale = ContentScale.Crop,

                modifier =
                Modifier
                    .fillMaxSize()


            )
            Spacer(modifier = Modifier.height(15.dp))


        }
        Text(
            text ="Continue to RiverIsland",
            fontSize = 30.sp,
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .clickable {
                    navController.navigate(Screen.ItemListScreen.route)
                }
        )
    }

}



