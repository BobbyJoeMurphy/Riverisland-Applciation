package com.example.riverislandapplication.Presentation.ItemList

import com.example.riverislandapplication.Data.remote.Dto.Product
import com.example.riverislandapplication.Domain.Models.Item

data class ItemListState(

    val isLoading:Boolean = false,
    val Items:List<Product>  = emptyList(),
    val error: String = ""
)
