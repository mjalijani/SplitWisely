package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.Category

interface CategoryRepository {
    suspend fun getCategories(): List<Category>
}