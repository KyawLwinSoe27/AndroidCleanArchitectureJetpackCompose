package com.example.androidappcleanarchitecture.store.domain.model

data class NetworkError (
    val error : ApiError,
    val t: Throwable? = null
)

enum class ApiError (val message: String) {
    NETWORK_ERROR("Network error"),
    UNKNOWN_ERROR("Unknown error"),
    TIMEOUT_ERROR("Timeout error"),
    SERVER_ERROR("Server error"),
    NOT_FOUND("Not found"),
    UNAUTHORIZED("Unauthorized"),
    FORBIDDEN("Forbidden"),
    BAD_REQUEST("Bad request"),
    UNPROCESSABLE_ENTITY("Unprocessable entity"),
    INTERNAL_SERVER_ERROR("Internal server error"),
    SERVICE_UNAVAILABLE("Service unavailable"),
    GATEWAY_TIMEOUT("Gateway timeout"),
    UNKNOWN("Unknown")
}