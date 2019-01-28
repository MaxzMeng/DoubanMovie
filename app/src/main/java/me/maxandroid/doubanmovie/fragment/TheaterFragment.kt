package me.maxandroid.doubanmovie.fragment

import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.theater_fragment.*
import me.maxandroid.doubanmovie.BaseAdapter
import me.maxandroid.doubanmovie.R
import me.maxandroid.doubanmovie.TheaterAdapter
import me.maxandroid.doubanmovie.databinding.ItemTheaterBinding
import me.maxandroid.doubanmovie.databinding.TheaterFragmentBinding
import me.maxandroid.doubanmovie.model.RspModel
import me.maxandroid.doubanmovie.model.common.Subject
import me.maxandroid.doubanmovie.network.FilmService
import retrofit2.Call
import retrofit2.Response

class TheaterFragment :
    RecyclerFragment<TheaterFragmentBinding, ItemTheaterBinding, RspModel<List<Subject>>, Subject>() {
    override val recyclerView: RecyclerView by lazy { recycler }
    override val adapter: BaseAdapter<Subject, ItemTheaterBinding> by lazy { TheaterAdapter() }
    override val call: Call<RspModel<List<Subject>>> by lazy {
        FilmService.getInTheaters()
    }


    override fun getLayoutId() = R.layout.theater_fragment

    override fun onResponse(call: Call<RspModel<List<Subject>>>, response: Response<RspModel<List<Subject>>>) {
        adapter.replace(response.body()?.result)
    }
}
