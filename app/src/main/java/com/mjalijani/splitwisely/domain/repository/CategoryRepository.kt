package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.Category
import com.mjalijani.splitwisely.utils.ResultState

interface CategoryRepository {
    suspend fun getCategories(): ResultState<List<Category>>
}