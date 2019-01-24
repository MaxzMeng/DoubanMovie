package me.maxandroid.doubanmovie

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

@BindingAdapter("imageFromUrl")
fun bindImageFromUrl(view: ImageView, imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty()) {
        Glide.with(view.context)
            .load(imageUrl)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(view)
    }
}

@BindingAdapter("rateFromNumber")
fun bindRateFromNumber(view: TextView, rate: Number?) {
    if (rate != null && rate != 0.0) {
        view.text = String.format("%.1f分", rate)
    } else {
        view.text = "暂无评分"
    }
}