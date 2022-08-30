package com.example.riverislandapplication.Data.remote

import com.example.riverislandapplication.Common.Resource
import com.example.riverislandapplication.Data.remote.Dto.ItemDTO
import com.example.riverislandapplication.Data.remote.Dto.Product
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ItemAPIinterface{
    @GET("plp/en_gb/2506/products.json")
    suspend fun Getitems(
    ): Response<ItemDTO>

}
