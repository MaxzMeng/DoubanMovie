package me.maxandroid.doubanmovie.model.subject

import com.google.gson.annotations.SerializedName

data class Comment(
    @SerializedName("doubanId")
    var id: Int,
    var name: String?,
    var avatar: String?,
    var votes: Int,
    var text: String?,
    var time: String?,
    var rate: Int
)
