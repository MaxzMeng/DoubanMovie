package me.maxandroid.doubanmovie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val host: NavHostFragment = nav_fragment as NavHostFragment? ?: return
        val navController = host.navController
        navigationView.setupWithNavController(navController)
    }

}
