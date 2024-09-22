package com.mjalijani.splitwisely.ui.expense.expenseDetail

import androidx.lifecycle.ViewModel
import com.mjalijani.splitwisely.domain.usecase.comment.GetCommentUseCase
import com.mjalijani.splitwisely.domain.usecase.expense.GetAnotherUserExpenseUseCase
import com.mjalijani.splitwisely.domain.usecase.expense.GetCurrentUserExpensesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ExpenseDetailViewModel @Inject constructor(
    private val getAnotherUserExpenseUseCase: GetAnotherUserExpenseUseCase,
    private val getCurrentUserExpensesUseCase: GetCurrentUserExpensesUseCase,
    private val deleteExpensesUseCase: GetCurrentUserExpensesUseCase,
    private val getCommentUseCase: GetCommentUseCase,
    private val addCommentUseCase: GetCommentUseCase,
    ) : ViewModel() {

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