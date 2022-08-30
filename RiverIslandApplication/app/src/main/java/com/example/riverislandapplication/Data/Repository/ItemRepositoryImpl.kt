package com.example.riverislandapplication.Data.Repository

import com.example.riverislandapplication.Common.Resource
import com.example.riverislandapplication.Data.remote.Dto.ItemDTO
import com.example.riverislandapplication.Data.remote.Dto.Product

import com.example.riverislandapplication.Data.remote.ItemAPIinterface
import com.example.riverislandapplication.Domain.Repository.ItemRepository
import retrofit2.Response
import javax.inject.Inject

class ItemRepositoryImpl @Inject constructor(
    private val api:ItemAPIinterface
    ):  ItemRepository {
    override suspend fun getitems(): Response<ItemDTO>{
        return api.Getitems()
    }

    override suspend fun getProductById(itemId: String): Product? {
    return api.Getitems().body()?.Products?.find{product->product.prodid==itemId}
    }
}