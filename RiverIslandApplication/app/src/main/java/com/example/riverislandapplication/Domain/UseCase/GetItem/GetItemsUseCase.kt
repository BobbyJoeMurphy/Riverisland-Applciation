package com.example.riverislandapplication.Domain.UseCase.GetItem

import com.example.riverislandapplication.Common.Resource
import com.example.riverislandapplication.Data.remote.Dto.ItemDTO
import com.example.riverislandapplication.Data.remote.Dto.Product
import com.example.riverislandapplication.Domain.Repository.ItemRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetItemsUseCase @Inject constructor(
    private val repository: ItemRepository
){
    operator fun invoke(): Flow<Resource<List<Product>?>> = flow{
            try {
                emit(Resource.Loading<List<Product>?>())
                val items = repository.getitems().body()?.Products
                emit(Resource.Success<List<Product>?>(items))
            } catch(e: HttpException) {
                emit(Resource.Error<List<Product>?>(e.localizedMessage ?: "An unexpected error occured"))
            } catch(e: IOException) {
                emit(Resource.Error<List<Product>?>("Couldn't reach server. Check your internet connection."))
            }
        }
    }