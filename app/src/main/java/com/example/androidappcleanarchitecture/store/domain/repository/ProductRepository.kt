package com.example.androidappcleanarchitecture.store.domain.repository

import arrow.core.Either
import com.example.androidappcleanarchitecture.store.domain.model.NetworkError
import com.example.androidappcleanarchitecture.store.domain.model.Product

interface ProductRepository {

    suspend fun getProducts() : Either<NetworkError,List<Product>>

}