package me.maxandroid.doubanmovie.model.coming

import com.google.gson.annotations.SerializedName

data class ComingSubject(
    @SerializedName("doubanId")
    var id: Int = 0,
    var avatar: String? = null,
    var name: String? = null,
    var date: String? = null,
    var label: String? = null,
    var area: String? = null,
    var like: Int = 0
)

