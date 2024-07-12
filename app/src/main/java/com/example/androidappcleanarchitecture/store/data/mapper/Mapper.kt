package com.example.androidappcleanarchitecture.store.data.mapper

import com.example.androidappcleanarchitecture.store.domain.model.ApiError
import com.example.androidappcleanarchitecture.store.domain.model.NetworkError
import retrofit2.HttpException
import java.io.IOException

fun Throwable.toNetwworkError(): NetworkError {
    val error =  when (this) {
        is IOException -> ApiError.NETWORK_ERROR
        is HttpException -> {
            when (code()) {
                401 -> ApiError.UNAUTHORIZED
                404 -> ApiError.NOT_FOUND
                else -> ApiError.UNKNOWN
            }
        }
        else -> ApiError.UNKNOWN_ERROR
    }
    return  NetworkError(error, this)
}