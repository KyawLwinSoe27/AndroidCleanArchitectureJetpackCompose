package com.example.androidappcleanarchitecture.di

import com.example.androidappcleanarchitecture.store.data.repository.ProductsRepositoryImpl
import com.example.androidappcleanarchitecture.store.domain.repository.ProductRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindProductRepository(
        productRepositoryImpl: ProductsRepositoryImpl
    ): ProductRepository
}