package me.maxandroid.doubanmovie

import me.maxandroid.doubanmovie.databinding.ItemTheaterBinding
import me.maxandroid.doubanmovie.model.common.Subject

class TheaterAdapter : BaseAdapter<Subject, ItemTheaterBinding>() {
    override fun onBindViewHolder(binding: ItemTheaterBinding, data: Subject) {
        binding.subject = data
    }

    override fun getResId() = R.layout.item_theater
}