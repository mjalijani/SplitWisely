package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.currency.Currency

interface CurrenciesRepository {
    suspend fun getCurrencies() : List<Currency>
}