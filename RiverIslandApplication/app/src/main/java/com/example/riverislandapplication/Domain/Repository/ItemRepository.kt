package com.example.riverislandapplication.Domain.Repository


import com.example.riverislandapplication.Data.remote.Dto.Product
import com.example.riverislandapplication.Data.remote.Dto.Productdto

interface ItemRepository {
    suspend fun getitems():List<Product>
    suspend fun getitemsid(itemId: String): Product
}