package com.example.riverislandapplication.Domain.UseCase.GetItem

import com.example.riverislandapplication.Common.Resource
import com.example.riverislandapplication.Data.remote.Dto.toItem
import com.example.riverislandapplication.Domain.Models.Item
import com.example.riverislandapplication.Domain.Repository.ItemRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetItemUseCase @Inject constructor(
    private val repository: ItemRepository
){
    operator fun invoke(): Flow<Resource<List<Item>>> = flow{
        try {
            emit(Resource.Loading())
            val items = repository.getitems().map { it.toItem() }
            emit(Resource.Success(items))
        }catch (e : HttpException){
            emit(Resource.Error(e.localizedMessage?:"error occurred"))
        }catch (e:IOException){
            emit(Resource.Error("Couldn't reach server. Check internet connection"))

        }

    }
}