package me.maxandroid.doubanmovie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T, DataBinding : ViewDataBinding> :
    RecyclerView.Adapter<BaseAdapter.ViewHolder<DataBinding>>() {
    val data: ArrayList<T> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder<DataBinding> {
        val binding: DataBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            getResId(),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size
    override fun onBindViewHolder(holder: ViewHolder<DataBinding>, position: Int) {
        onBindViewHolder(holder.binding, data[position])
    }

    abstract fun getResId(): Int

    abstract fun onBindViewHolder(binding: DataBinding, data: T)

    class ViewHolder<DataBinding : ViewDataBinding>(val binding: DataBinding) : RecyclerView.ViewHolder(binding.root)
}