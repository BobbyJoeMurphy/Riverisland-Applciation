package com.example.riverislandapplication.Presentation.ItemDetailList.Components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.riverislandapplication.R

@Composable
fun AddToBagBox(

)

     {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.fillMaxSize()) {

            ExtendedFloatingActionButton(
                text = {Text("Add to cart")},
                onClick = { /*TODO*/ },
            icon = { Icon(painter = painterResource(id = R.drawable.ic_baseline_shopping_cart_24), contentDescription = "cart")})

        Spacer(modifier = Modifier.height(15.dp))
        }

    }




//{
//    Box(modifier = Modifier
//        .border(width = 1.dp,
//        color = Color.Yellow,
//        shape = RoundedCornerShape(100.dp)
//        )
//        .padding(10.dp)
//    ){
//        Text(
//            text = "Add to bag",
//            color = MaterialTheme.colors.primary,
//            textAlign = TextAlign.Center,
//            style = MaterialTheme.typography.body2)
//    }
//}