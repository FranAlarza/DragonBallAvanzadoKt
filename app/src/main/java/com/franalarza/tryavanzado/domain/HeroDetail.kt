package com.franalarza.tryavanzado.domain

data class HeroDetail(
    val id: String,
    val name: String,
    val photo: String,
    val description: String,
    var favorite: Boolean,
)
