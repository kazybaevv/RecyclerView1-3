package com.example.recyclerview1_3

import java.io.Serializable

data class CarModel(
    val img: String,
    val name: String,
    val price: String,
    val releaseDate: String
): Serializable
