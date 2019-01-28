package me.maxandroid.doubanmovie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import java.util.*

abstract class BaseAdapter<Data, DataBinding : ViewDataBinding>(var listener: ViewHolderOnClickListener<Data>? = null) :
    RecyclerView.Adapter<BaseAdapter.ViewHolder<DataBinding>>() {
    private val dataList: ArrayList<Data> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder<DataBinding> {
        val binding: DataBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            getResId(),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = dataList.size
    override fun onBindViewHolder(holder: ViewHolder<DataBinding>, position: Int) {
        val data = dataList[position]
        onBindViewHolder(holder.binding, data)
        holder.itemView.setOnLongClickListener {
            listener?.onLongClick(data) as Boolean
        }
        holder.itemView.setOnClickListener {
            listener?.onClick(data)
        }
    }

    abstract fun getResId(): Int

    abstract fun onBindViewHolder(binding: DataBinding, data: Data)

    fun add(data: Data) {
        dataList.add(data)
        notifyItemInserted(dataList.size - 1)
    }

    fun add(list: Collection<Data>?) {
        if (!list.isNullOrEmpty()) {
            val startPos = dataList.size
            dataList.addAll(list)
            notifyItemRangeInserted(startPos, list.size)
        }
    }

    fun clear() {
        dataList.clear()
        notifyDataSetChanged()
    }

    fun replace(list: Collection<Data>?) {
        if (list.isNullOrEmpty())
            return
        dataList.clear()
        dataList.addAll(list)
        notifyDataSetChanged()
    }

    class ViewHolder<DataBinding : ViewDataBinding>(val binding: DataBinding) : RecyclerView.ViewHolder(binding.root)
    interface ViewHolderOnClickListener<Data> {
        fun onClick(data: Data)

        fun onLongClick(data: Data): Boolean
    }

    class ViewHolderOnClickListenerImpl<Data> : ViewHolderOnClickListener<Data> {
        override fun onLongClick(data: Data): Boolean = false

        override fun onClick(data: Data) {

        }

    }
}