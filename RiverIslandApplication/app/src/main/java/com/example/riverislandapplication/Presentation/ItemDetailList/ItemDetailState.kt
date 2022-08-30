package com.example.riverislandapplication.Presentation.ItemDetailList


import com.example.riverislandapplication.Data.remote.Dto.Product
import com.example.riverislandapplication.Domain.Models.ItemDetail

data class ItemDetailState(

    val isLoading:Boolean = false,
    val Item:Product? = null,
    val error: String = ""
)
