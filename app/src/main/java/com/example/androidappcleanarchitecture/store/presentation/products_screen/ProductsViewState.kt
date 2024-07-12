package com.example.androidappcleanarchitecture.store.presentation.products_screen

import com.example.androidappcleanarchitecture.store.domain.model.Product

data class ProductsViewState (
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String?  = null
    )