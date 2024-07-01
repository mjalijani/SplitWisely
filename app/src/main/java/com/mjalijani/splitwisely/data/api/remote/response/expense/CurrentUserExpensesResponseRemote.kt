package com.mjalijani.splitwisely.data.api.remote.response.expense

import com.google.gson.annotations.SerializedName

data class CurrentUserExpensesResponseRemote(
    @SerializedName("expenses")
    val expenses : List<Expense>
)
