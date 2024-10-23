package com.mjalijani.splitwisely.utils.callAdapter

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Converter
import java.lang.reflect.Type

internal class NetworkResponseAdapter<RESPONSE : BaseNetworkResponse>(
    private val successType: Type,
    private val errorConverter: Converter<ResponseBody, String>,
) : CallAdapter<RESPONSE, Call<NetworkResponse<RESPONSE>>> {

    override fun responseType(): Type = successType

    override fun adapt(call: Call<RESPONSE>): Call<NetworkResponse<RESPONSE>> {
        return NetworkResponseCall(call, errorConverter)
    }
}