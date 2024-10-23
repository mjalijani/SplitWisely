package com.mjalijani.splitwisely.domain.usecase.category

import com.mjalijani.splitwisely.domain.repository.CategoryRepository
import javax.inject.Inject

class GetCategoryUseCase @Inject constructor(
    private val categoryRepository: CategoryRepository
) {

    suspend operator fun invoke() = categoryRepository.getCategories()

}