package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.expense.CreateExpenseParam
import com.mjalijani.splitwisely.domain.entity.expense.Expense
import com.mjalijani.splitwisely.utils.ResultState

interface ExpenseRepository {

    suspend fun getCurrentUserExpenses(): ResultState<List<Expense>>

    suspend fun getAnotherUserExpense(id: String): ResultState<Expense>

    suspend fun createExpense(createExpenseParam: CreateExpenseParam): ResultState<List<Expense>>

    suspend fun updateExpense(id: String, createExpenseParam: CreateExpenseParam): ResultState<List<Expense>>

    suspend fun deleteExpense(id: String): ResultState<List<Expense>>

    suspend fun undeleteExpense(id: String): ResultState<List<Expense>>

}