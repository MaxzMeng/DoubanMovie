package me.maxandroid.doubanmovie.model.subject

import com.google.gson.annotations.SerializedName
import me.maxandroid.doubanmovie.model.common.Cast
import me.maxandroid.doubanmovie.model.common.Images
import me.maxandroid.doubanmovie.model.common.Rating

data class SubjectRspModel(
    var rating: Rating?,
    @SerializedName("reviews_count")
    var reviewsCount: Int,
    @SerializedName("wish_count")
    var wishCount: Int,
    @SerializedName("douban_site")
    var doubanSite: String?,
    var year: String?,
    var images: Images?,
    var alt: String?,
    var id: String?,
    @SerializedName("mobile_url")
    var mobileUrl: String?,
    var title: String?,
    @SerializedName("do_count")
    var doCount: String?,
    @SerializedName("share_url")
    var shareUrl: String?,
    @SerializedName("seasons_count")
    var seasonsCount: String?,
    @SerializedName("schedule_url")
    var scheduleUrl: String?,
    @SerializedName("episodes_count")
    var episodesCount: String?,
    var countries: List<String>?,
    var genres: List<String>?,
    @SerializedName("collect_count")
    var collectCount: Int,
    var casts: List<Cast>?,
    @SerializedName("current_season")
    var currentSeason: String?,
    @SerializedName("original_title")
    var originalTitle: String?,
    var summary: String?,
    var subtype: String?,
    var directors: List<Directors>?,
    @SerializedName("comments_count")
    var commentsCount: Int,
    @SerializedName("ratings_count")
    var ratingsCount: Int,
    var aka: List<String>?
)