package com.mjalijani.splitwisely.domain.entity.expense

data class CreateExpenseParam(
    val categoryId: Int,
    val cost: String,
    val currencyCode: String,
    val date: String,
    val description: String,
    val details: String,
    val groupId: Int,
    val repeatInterval: String,
    val splitEqually: Boolean
)
