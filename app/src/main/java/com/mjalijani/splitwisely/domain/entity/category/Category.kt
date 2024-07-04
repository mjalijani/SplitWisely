package com.mjalijani.splitwisely.domain.entity.category

import com.mjalijani.splitwisely.data.api.remote.entity.response.IconTypesDto

data class Category(
    val icon: String,
    val iconTypes: IconType,
    val id: Int,
    val name: String,
    val subcategories: List<Subcategory>
)

data class Subcategory(
    val icon: String,
    val iconTypes: IconType,
    val id: Int,
    val name: String
)
