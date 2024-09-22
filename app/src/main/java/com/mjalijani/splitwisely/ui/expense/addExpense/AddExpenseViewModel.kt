package com.mjalijani.splitwisely.ui.expense.addExpense

import androidx.lifecycle.ViewModel
import com.mjalijani.splitwisely.domain.usecase.expense.CreateExpenseUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class AddExpenseViewModel @Inject constructor(
    private val createExpenseUseCase: CreateExpenseUseCase
) : ViewModel() {
    fun addExpense(){}
}