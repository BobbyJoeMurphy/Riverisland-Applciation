package com.example.riverislandapplication.Presentation.ItemList

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.riverislandapplication.Common.Resource
import com.example.riverislandapplication.Domain.UseCase.GetItem.GetItemsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ItemListViewModel @Inject constructor(
    private val getItemsUseCase: GetItemsUseCase
): ViewModel(){

    private val _State = mutableStateOf(ItemListState())
    val state: State<ItemListState> = _State


    init {
        getItems()
    }

private fun getItems(){
    getItemsUseCase().onEach { result->
        when(result){
            is Resource.Success ->{
                _State.value = ItemListState(Items = result.data ?: emptyList())

            } is Resource.Error ->{
                _State.value = ItemListState(
                    error = result.message ?: "unexpected error"
            )

        } is Resource.Loading ->{
            _State.value = ItemListState(isLoading = true)

        }

        }
    }.launchIn(viewModelScope)
    }




}