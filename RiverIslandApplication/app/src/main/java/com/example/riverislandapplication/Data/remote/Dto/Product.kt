package com.example.riverislandapplication.Data.remote.Dto

import com.example.riverislandapplication.Domain.Models.Item

data class Product(
    val allImages: List<String>,
    val altImage: String,
    val brands: String,
    val category: String,
    val collections: String,
    val colour: String,
    val cost: String,
    val costAUD: String,
    val costEUR: String,
    val costSEK: String,
    val costUSD: String,
    val costWEK: String,
    val costWER: String,
    val dateSort: Int,
    val design: String,
    val fit: String,
    val hasPriceRange: Boolean,
    val isNewArrival: Boolean,
    val isTrending: Boolean,
    val mediaIcon: String,
    val name: String,
    val prodid: String,
    val promotionImage: String,
    val sizes: String,
    val swatches: List<Swatche>,
    val trackingCategoriesInfo: TrackingCategoriesInfo,
    val wascost: String,
    val wascostAUD: String,
    val wascostEUR: String,
    val wascostSEK: String,
    val wascostUSD: String,
    val wascostWEK: String,
    val wascostWER: String
)
fun Product.toItem():Item {
    return Item(
        name = name,
        prodid = prodid,
        cost = cost
    )
}
    fun Product.toItemDescription(): Item {
        return Item(
            name = name,
            prodid = prodid,
            cost = cost
        )

    }
