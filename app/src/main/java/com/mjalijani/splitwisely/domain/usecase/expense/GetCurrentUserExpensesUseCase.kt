package com.mjalijani.splitwisely.domain.usecase.expense

import com.mjalijani.splitwisely.domain.repository.ExpenseRepository
import javax.inject.Inject

class GetCurrentUserExpensesUseCase @Inject constructor(
    private val expenseRepository: ExpenseRepository
) {

    suspend operator fun invoke() = expenseRepository.getCurrentUserExpenses()

}