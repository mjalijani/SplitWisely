package com.mjalijani.splitwisely.domain.entity.expense

import com.mjalijani.splitwisely.domain.entity.Category
import com.mjalijani.splitwisely.domain.entity.comment.Comment
import com.mjalijani.splitwisely.domain.entity.user.User

data class Expense(
    val category: Category,
    val categoryId: Int,
    val comments: List<Comment>,
    val commentsCount: Int,
    val cost: String,
    val createdAt: String,
    val createdBy: ActionBy,
    val currencyCode: String,
    val date: String,
    val deletedAt: String,
    val deletedBy: ActionBy,
    val description: String,
    val details: String,
    val emailReminder: Boolean,
    val emailReminderInAdvance: Any?,
    val expenseBundleId: Int,
    val friendshipId: Int,
    val groupId: Int,
    val id: Int,
    val nextRepeat: String,
    val payment: Boolean,
    val receipt: ExpenseReceipt,
    val repayments: List<Repayment>,
    val repeatInterval: String,
    val repeats: Boolean,
    val transactionConfirmed: Boolean,
    val updatedAt: String,
    val updatedBy: ActionBy,
    val users: List<User>
)
