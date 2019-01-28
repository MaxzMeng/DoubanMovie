package me.maxandroid.doubanmovie.fragment

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

abstract class CallFragment<FragmentBinding : ViewDataBinding, RspModel>
    : BaseFragment<FragmentBinding>(),
    Callback<RspModel> {
    protected abstract val call: Call<RspModel>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        call.enqueue(this)
    }

    override fun onFailure(call: Call<RspModel>, t: Throwable) {

    }

    override fun onResponse(call: Call<RspModel>, response: Response<RspModel>) {

    }
}
