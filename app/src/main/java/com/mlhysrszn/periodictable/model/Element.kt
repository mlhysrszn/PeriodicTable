package com.mlhysrszn.periodictable.model

data class Element(
    val number: Int? = null,
    val symbol: String? = null,
    val name: String? = null,
    val weight: Float? = null,
    val backgroundColor: Int? = null,
    val textColor: String? = null,
    val image: String? = null,
    val isClickable: Boolean? = null
)
