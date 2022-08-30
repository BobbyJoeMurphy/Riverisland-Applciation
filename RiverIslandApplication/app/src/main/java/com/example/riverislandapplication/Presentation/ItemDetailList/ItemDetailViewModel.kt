package com.example.riverislandapplication.Presentation.ItemDetailList

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.riverislandapplication.Common.Constants
import com.example.riverislandapplication.Common.Resource
import com.example.riverislandapplication.Domain.UseCase.GetItems.GetItemUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ItemDetailViewModel @Inject constructor(
    private val getItemUseCase: GetItemUseCase,
     savedStateHandle: SavedStateHandle
): ViewModel(){

    private val _State = mutableStateOf(ItemDetailState())
    val state: State<ItemDetailState> = _State

    init {
       savedStateHandle.get<String>("prodid")?.let{
               itemId ->
           getItem(itemId)
           println( "Testing"+itemId)
       }
    }

private fun getItem(prodid :String){
    getItemUseCase(prodid).onEach { result->
        when(result){
            is Resource.Success ->{
                _State.value = ItemDetailState(Item = result.data)
                println( "Testing2"+result.data)

            } is Resource.Error ->{
                _State.value = ItemDetailState(
                    error = result.message ?: "unexpected error"
            )

        } is Resource.Loading ->{
            _State.value = ItemDetailState(isLoading = true)

        }

        }
    }.launchIn(viewModelScope)
    }


}