package com.example.riverislandapplication.Domain.Repository

import com.example.riverislandapplication.Data.remote.Dto.ItemDTO
import com.example.riverislandapplication.Data.remote.Dto.Product

interface ItemRepository {
    suspend fun getitems():List<Product>
    suspend fun getitemsid(itemId:String):List<Product>
}