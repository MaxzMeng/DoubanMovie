package me.maxandroid.doubanmovie.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.theater_fragment.*
import me.maxandroid.doubanmovie.R
import me.maxandroid.doubanmovie.TheaterAdapter
import me.maxandroid.doubanmovie.model.RspModel
import me.maxandroid.doubanmovie.model.common.Subject
import me.maxandroid.doubanmovie.network.FilmService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class TheaterFragment : Fragment(), Callback<RspModel<List<Subject>>> {
    val adapter = TheaterAdapter()
    override fun onFailure(call: Call<RspModel<List<Subject>>>, t: Throwable) {
        Toast.makeText(context, "失败", Toast.LENGTH_LONG).show()
    }

    override fun onResponse(call: Call<RspModel<List<Subject>>>, response: Response<RspModel<List<Subject>>>) {
        val result = response.body()!!.result
        adapter.data.add(result[0])
        adapter.notifyDataSetChanged()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.theater_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val call: Call<RspModel<List<Subject>>> = FilmService.getInTheaters()
        call.enqueue(this)

        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = adapter
    }
}
