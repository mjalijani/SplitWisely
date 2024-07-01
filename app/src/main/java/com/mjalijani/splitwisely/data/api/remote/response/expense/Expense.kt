package com.mjalijani.splitwisely.data.api.remote.response.expense


import com.google.gson.annotations.SerializedName
import com.mjalijani.splitwisely.data.api.remote.response.user.User

data class Expense(
    @SerializedName("category")
    val category: Category,
    @SerializedName("category_id")
    val categoryId: Int,
    @SerializedName("comments")
    val comments: List<Comment>,
    @SerializedName("comments_count")
    val commentsCount: Int,
    @SerializedName("cost")
    val cost: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("created_by")
    val createdBy: CreatedBy,
    @SerializedName("currency_code")
    val currencyCode: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("deleted_at")
    val deletedAt: String,
    @SerializedName("deleted_by")
    val deletedBy: DeletedBy,
    @SerializedName("description")
    val description: String,
    @SerializedName("details")
    val details: String,
    @SerializedName("email_reminder")
    val emailReminder: Boolean,
    @SerializedName("email_reminder_in_advance")
    val emailReminderInAdvance: Any?,
    @SerializedName("expense_bundle_id")
    val expenseBundleId: Int,
    @SerializedName("friendship_id")
    val friendshipId: Int,
    @SerializedName("group_id")
    val groupId: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("next_repeat")
    val nextRepeat: String,
    @SerializedName("payment")
    val payment: Boolean,
    @SerializedName("receipt")
    val receipt: Receipt,
    @SerializedName("repayments")
    val repayments: List<Repayment>,
    @SerializedName("repeat_interval")
    val repeatInterval: String,
    @SerializedName("repeats")
    val repeats: Boolean,
    @SerializedName("transaction_confirmed")
    val transactionConfirmed: Boolean,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("updated_by")
    val updatedBy: UpdatedBy,
    @SerializedName("users")
    val users: List<User>
)