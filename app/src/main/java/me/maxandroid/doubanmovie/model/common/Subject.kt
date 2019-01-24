package me.maxandroid.doubanmovie.model.common

import com.google.gson.annotations.SerializedName
import me.maxandroid.doubanmovie.model.subject.Directors

data class Subject(
    var rating: Rating?,
    var genres: List<String>?,
    var title: String?,
    var casts: List<Cast>?,
    @SerializedName("collect_count")
    var collectCount: Int = 0,
    @SerializedName("original_title")
    var originalTitle: String?,
    var subtype: String?,
    var directors: List<Directors>?,
    var year: String?,
    var images: Images?,
    var alt: String?,
    var id: String?
)
