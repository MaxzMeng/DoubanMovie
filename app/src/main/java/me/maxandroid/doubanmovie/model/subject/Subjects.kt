package me.maxandroid.doubanmovie.model.subject

import me.maxandroid.doubanmovie.model.common.Subject

data class Subjects(
    var box: Int,
    var new: Boolean,
    var rank: Int,
    var subject: Subject?
)
