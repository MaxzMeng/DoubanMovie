package me.maxandroid.doubanmovie.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<fragmentBinding : ViewDataBinding> : Fragment() {
    protected lateinit var fragmentBinding: ViewDataBinding
    @LayoutRes
    abstract fun getLayoutId(): Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentBinding = DataBindingUtil.inflate<fragmentBinding>(inflater, getLayoutId(), container, false)
        return fragmentBinding.root
    }
}