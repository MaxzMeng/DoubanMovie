package me.maxandroid.doubanmovie.model.common

data class Rating(
    var max: Int,
    var average: Double,
    var stars: String?,
    var min: Int
)