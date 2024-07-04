package com.mjalijani.splitwisely.domain.repository

import com.mjalijani.splitwisely.domain.entity.currency.Currency
import com.mjalijani.splitwisely.utils.ResultState

interface CurrenciesRepository {
    suspend fun getCurrencies() : ResultState<List<Currency>>
}