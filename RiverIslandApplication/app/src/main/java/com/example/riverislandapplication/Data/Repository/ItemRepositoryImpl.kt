package com.example.riverislandapplication.Data.Repository

import com.example.riverislandapplication.Data.remote.Dto.Product
import com.example.riverislandapplication.Data.remote.ItemAPIinterface
import com.example.riverislandapplication.Domain.Repository.ItemRepository
import javax.inject.Inject

class ItemRepositoryImpl @Inject constructor(private val api:ItemAPIinterface):ItemRepository {
    override suspend fun getitems(): List<Product> {
        return api.Getitems()
    }

    override suspend fun getitemsid(itemId: String): List<Product> {
return api.getItemByID(itemId)
    }
}