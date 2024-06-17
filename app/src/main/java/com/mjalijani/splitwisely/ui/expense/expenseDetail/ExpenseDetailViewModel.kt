package com.mjalijani.splitwisely.ui.expense.expenseDetail

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel


@HiltViewModel
class ExpenseDetailViewModel : ViewModel() {

    init {
        getExpenseDetail()
        getComments()
    }

    private fun getExpenseDetail() {

    }

    private fun getComments() {

    }

    fun addComment() {

    }

    fun editExpense() {

    }

    fun deleteExpense() {}
}