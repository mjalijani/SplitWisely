package com.mjalijani.splitwisely.domain.entity.group

data class GroupOriginalDebt(
    val amount: String,
    val currencyCode: String,
    val from: Int,
    val to: Int
)
