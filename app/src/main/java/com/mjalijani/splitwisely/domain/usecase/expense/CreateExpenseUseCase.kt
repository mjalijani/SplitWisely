package com.mjalijani.splitwisely.domain.usecase.expense

import com.mjalijani.splitwisely.domain.entity.expense.CreateExpenseParam
import com.mjalijani.splitwisely.domain.repository.ExpenseRepository
import javax.inject.Inject

class CreateExpenseUseCase @Inject constructor(
    private val expenseRepository: ExpenseRepository
) {

    suspend operator fun invoke(createExpenseParam: CreateExpenseParam) =
        expenseRepository.createExpense(createExpenseParam)

}