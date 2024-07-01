package com.mjalijani.splitwisely.data.api.remote.service

import com.mjalijani.splitwisely.data.api.remote.entity.response.SupportedCategoriesResponseRemote
import retrofit2.Response
import retrofit2.http.GET

interface CategoryApiRemoteService {

    @GET("get_categories")
    suspend fun getCategories(): Response<SupportedCategoriesResponseRemote>

}