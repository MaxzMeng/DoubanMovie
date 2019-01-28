package me.maxandroid.doubanmovie.fragment

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import me.maxandroid.doubanmovie.BaseAdapter

abstract class RecyclerFragment<FragmentBinding : ViewDataBinding,
        ItemViewBinding : ViewDataBinding,
        RspModel, DataType> :
    CallFragment<FragmentBinding, RspModel>() {
    protected abstract val recyclerView: RecyclerView
    protected abstract val adapter: BaseAdapter<DataType, ItemViewBinding>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = getLayoutManager()
    }

    protected fun getLayoutManager() = LinearLayoutManager(context)

}