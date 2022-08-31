package com.example.riverislandapplication.Presentation.ItemDetailList

import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.animateInt
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

import coil.compose.SubcomposeAsyncImage


@Composable
fun ItemDetailScreen(
    viewModel: ItemDetailViewModel = hiltViewModel()
) {
    val state = viewModel.state.value


    state.Item?.let { Item ->
        Box(modifier = Modifier
                 .fillMaxWidth()

        ){
                SubcomposeAsyncImage(

                    modifier = Modifier.fillMaxWidth(),
                    model = Item.allImages[0],
                    loading = {
                        CircularProgressIndicator()
                    },
                    contentDescription = "",

                )


            }

        }

}










