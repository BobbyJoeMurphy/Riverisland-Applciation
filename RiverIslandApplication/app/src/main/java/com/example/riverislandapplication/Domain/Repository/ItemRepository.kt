package com.example.riverislandapplication.Domain.Repository


import com.example.riverislandapplication.Common.Resource
import com.example.riverislandapplication.Data.remote.Dto.ItemDTO
import com.example.riverislandapplication.Data.remote.Dto.Product

import retrofit2.Response


interface ItemRepository {
    suspend fun getitems(): Response<ItemDTO>
    suspend fun getProductById(itemId: String): Product?
}