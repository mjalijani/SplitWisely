package com.mjalijani.splitwisely.data.api.remote.service

import com.mjalijani.splitwisely.data.api.remote.entity.response.SupportedCurrenciesResponseRemote
import retrofit2.Response
import retrofit2.http.GET

interface CurrenciesApiRemoteService {

    @GET("get_currencies")
    suspend fun getCurrencies(): Response<SupportedCurrenciesResponseRemote>

}