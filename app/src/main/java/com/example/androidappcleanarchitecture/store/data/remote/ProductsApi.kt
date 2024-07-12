package com.example.androidappcleanarchitecture.store.data.remote

import com.example.androidappcleanarchitecture.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): List<Product>
}