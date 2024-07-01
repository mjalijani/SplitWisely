package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.expense.CreateExpenseParam
import com.mjalijani.splitwisely.domain.entity.expense.Expense

interface ExpenseRepository {

    suspend fun getCurrentUserExpenses(): List<Expense>

    suspend fun getAnotherUser(id: String): Expense

    suspend fun createExpense(createExpenseParam: CreateExpenseParam): List<Expense>

    suspend fun updateExpense(id: String, createExpenseParam: CreateExpenseParam): List<Expense>

    suspend fun deleteExpense(id: String): List<Expense>

    suspend fun undeleteExpense(id: String): List<Expense>

}