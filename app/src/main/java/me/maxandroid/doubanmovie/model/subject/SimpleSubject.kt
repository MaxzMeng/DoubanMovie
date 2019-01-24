package me.maxandroid.doubanmovie.model.subject

import com.google.gson.annotations.SerializedName

data class SimpleSubject(
    @SerializedName("doubanId")
    var id: Int,
    var img: String?,
    var name: String?
)