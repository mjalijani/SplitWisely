package com.mjalijani.splitwisely.utils.callAdapter

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class NetworkResponse<out T : BaseNetworkResponse> {
    @Serializable
    data class Success<out T : BaseNetworkResponse>(val data: T?) : NetworkResponse<T>()

    @Serializable
    data class ApiError(val error: String) : NetworkResponse<Nothing>()
    data class Exception(val throwable: Throwable) : NetworkResponse<Nothing>()
}

@Serializable
open class BaseNetworkResponse(
    @SerialName("error")
    val error: String = "",
    @SerialName("errors")
    val errors: NetworkError = NetworkError(listOf())
) {
    val isSuccess: Boolean
        get() {
            return error.isEmpty() && errors.errors.isEmpty()
        }

}

@Serializable
data class NetworkError(
    @SerialName("base")
    val errors: List<String>
)
