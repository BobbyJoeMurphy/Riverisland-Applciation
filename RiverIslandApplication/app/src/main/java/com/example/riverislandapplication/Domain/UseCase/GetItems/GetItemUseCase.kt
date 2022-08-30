package com.example.riverislandapplication.Domain.UseCase.GetItems

import com.example.riverislandapplication.Common.Resource
import com.example.riverislandapplication.Data.remote.Dto.Product
import com.example.riverislandapplication.Domain.Repository.ItemRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetItemUseCase @Inject constructor(
    private val repository: ItemRepository
){
    operator fun invoke(itemId: String): Flow<Resource<Product?>> = flow{
        try {
            emit(Resource.Loading<Product?>())
            val itemId = repository.getProductById(itemId)
            emit(Resource.Success<Product?>(itemId))
        } catch(e: HttpException) {
            emit(Resource.Error<Product?>(e.localizedMessage ?: "An unexpected error occured"))
        } catch(e: IOException) {
            emit(Resource.Error<Product?>("Couldn't reach server. Check your internet connection."))
        }
    }
}
