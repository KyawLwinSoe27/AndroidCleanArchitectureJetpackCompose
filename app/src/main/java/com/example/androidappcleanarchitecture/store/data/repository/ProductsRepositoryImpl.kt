package com.example.androidappcleanarchitecture.store.data.repository

import arrow.core.Either
import com.example.androidappcleanarchitecture.store.data.mapper.toNetwworkError
import com.example.androidappcleanarchitecture.store.data.remote.ProductsApi
import com.example.androidappcleanarchitecture.store.domain.model.NetworkError
import com.example.androidappcleanarchitecture.store.domain.model.Product
import com.example.androidappcleanarchitecture.store.domain.repository.ProductRepository
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(private val productsApi: ProductsApi) :
    ProductRepository {
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
            productsApi.getProducts()
        }.mapLeft { it.toNetwworkError() }
    }
}