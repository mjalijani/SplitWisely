package com.mjalijani.splitwisely.utils

import com.mjalijani.splitwisely.utils.callAdapter.BaseNetworkResponse
import com.mjalijani.splitwisely.utils.callAdapter.NetworkResponse


sealed class ResultState<out T> {
    data class Success<T>(val data: T) : ResultState<T>()

    data class Failure(val error: String) : ResultState<Nothing>()

    data class Exception(val error: Throwable) : ResultState<Nothing>() {
        init {
            error.printStackTrace()
        }
    }

    val isSuccess: Boolean
        get() = this is Success
}


suspend fun <T : BaseNetworkResponse, S> NetworkResponse<T>.toResultState(
    onFailure: (suspend (error: String) -> Unit)? = null,
    onSuccess: suspend (T) -> ResultState.Success<S>
): ResultState<S> {
    return try {
        when (val result = this) {
            is NetworkResponse.ApiError -> {
                onFailure?.invoke(result.error)
                ResultState.Failure(
                    error = result.error
                )
            }

            is NetworkResponse.Exception -> {
                ResultState.Exception(result.throwable)
            }

            is NetworkResponse.Success -> {
                onSuccess(result.data!!) // if data is null, catch as Exception
            }
        }
    } catch (e: Exception) {
        ResultState.Exception(Throwable(e))
    }
}
