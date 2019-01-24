package me.maxandroid.doubanmovie.model

import com.google.gson.annotations.SerializedName

data class RspModel<T>(
    var count: Int,
    var start: Int,
    var total: Int,
    @SerializedName("subjects")
    var result: T,
    var title: String?
)