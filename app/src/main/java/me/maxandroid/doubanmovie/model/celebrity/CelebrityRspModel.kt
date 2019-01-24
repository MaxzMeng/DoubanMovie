package me.maxandroid.doubanmovie.model.celebrity

import com.google.gson.annotations.SerializedName
import me.maxandroid.doubanmovie.model.common.Avatars

data class CelebrityRspModel(
    var id: String,
    var name: String?,
    @SerializedName("name_en")
    var nameEn: String?,
    var alt: String?,
    var avatars: Avatars?,
    var aka: List<String>?,
    @SerializedName("aka_en")
    var akaEn: List<String>?,
    var gender: String?,
    @SerializedName("mobile_url")
    var mobileUrl: String?,
    var works: List<Works>?,
    @SerializedName("born_place")
    var bornPlace: String?
)
