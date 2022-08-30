package com.example.riverislandapplication.Presentation.ItemList.Components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.riverislandapplication.Data.remote.Dto.Product
import com.example.riverislandapplication.Domain.Models.Item


@Composable
fun itemListItem(
    item: Product,
    onItemClick: (Product)-> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(item) }
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween) {

        Text(
            text ="${item.name} "
        )
        Text(
            text ="${item.prodid} "
        )

    }


}