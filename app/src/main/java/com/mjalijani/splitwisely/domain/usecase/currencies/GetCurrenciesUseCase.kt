package com.mjalijani.splitwisely.domain.usecase.currencies

import com.mjalijani.splitwisely.domain.repository.CurrenciesRepository
import javax.inject.Inject

class GetCurrenciesUseCase @Inject constructor(
    private val currenciesRepository: CurrenciesRepository
) {
    suspend operator fun invoke() = currenciesRepository.getCurrencies()
}