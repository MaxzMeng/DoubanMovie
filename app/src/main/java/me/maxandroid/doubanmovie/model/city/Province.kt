package me.maxandroid.doubanmovie.model.city

data class Province(
    var id: Int,
    var name: String,
    var alias: String,
    val cities: List<City>
)