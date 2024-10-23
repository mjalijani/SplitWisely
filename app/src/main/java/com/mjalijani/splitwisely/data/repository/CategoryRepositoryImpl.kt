package com.mjalijani.splitwisely.data.repository

import com.mjalijani.splitwisely.data.api.remote.service.CategoryApiRemoteService
import com.mjalijani.splitwisely.domain.entity.category.Category
import com.mjalijani.splitwisely.domain.repository.CategoryRepository
import com.mjalijani.splitwisely.utils.ResultState
import com.mjalijani.splitwisely.utils.toResultState
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor(
    private val categoryApiRemoteService: CategoryApiRemoteService
) : CategoryRepository {
    override suspend fun getCategories(): ResultState<List<Category>> {
        return categoryApiRemoteService.getCategories().toResultState(onSuccess = { resultDto ->
            ResultState.Success(resultDto.categories.map { it.toDomainModel() })
        })
    }
}