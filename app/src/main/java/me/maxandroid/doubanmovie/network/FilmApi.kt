package me.maxandroid.doubanmovie.network

import me.maxandroid.doubanmovie.model.RspModel
import me.maxandroid.doubanmovie.model.celebrity.CelebrityRspModel
import me.maxandroid.doubanmovie.model.city.Province
import me.maxandroid.doubanmovie.model.coming.ComingSubject
import me.maxandroid.doubanmovie.model.common.Subject
import me.maxandroid.doubanmovie.model.subject.Comment
import me.maxandroid.doubanmovie.model.subject.SimpleSubject
import me.maxandroid.doubanmovie.model.subject.SubjectRspModel
import me.maxandroid.doubanmovie.model.subject.Subjects
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FilmApi {
    @GET("subjects/{id}")
    fun getMovieSubject(@Path("id") id: String): Call<SubjectRspModel>

    @GET("celebrity/{id}")
    fun getCelebrityDetail(@Path("id") id: String): Call<CelebrityRspModel>


    @GET("search")
    fun searchMovieByTag(@Query("tag") tag: String, @Query("start") start: Int, @Query("count") count: Int): Call<RspModel<List<Subject>>>

    @GET("search")
    fun searchMovieByQ(@Query("q") Q: String): Call<RspModel<List<Subject>>>

    @GET("top250")
    fun getTop250(@Query("start") start: Int, @Query("count") count: Int): Call<RspModel<List<Subject>>>

    @GET("us_box")
    fun getUSBox(): Call<RspModel<List<Subjects>>>

    @GET("in_theaters")
    fun getInTheaters(@Query("start") start: Int = 0, @Query("count") count: Int = 20, @Query("city") city: String = "北京"): Call<RspModel<List<Subject>>>

    @GET("coming_soon")
    fun getComing(): Call<List<ComingSubject>>

    @GET("comment/{id}")
    fun getComments(@Path("id") id: String): Call<List<Comment>>

    @GET("movie_hot")
    fun getHot(): Call<List<SimpleSubject>>

    @GET("city")
    fun getCities(): Call<List<Province>>
}

object FilmService : FilmApi by retrofit.create(FilmApi::class.java)