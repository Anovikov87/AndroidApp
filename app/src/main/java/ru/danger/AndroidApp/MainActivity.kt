package ru.danger.AndroidApp

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity(), FragmentMoviesDetails.ClickListener {
    private val listFragment = FragmentMoviesList()
    private val detailsFragment = FragmentMoviesDetails()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .apply {
                    add(R.id.main_container, listFragment)
                    commit()
                }
    }


    override fun goBack() {
        supportFragmentManager.beginTransaction()
                .apply {
                    remove(detailsFragment)
                    add(R.id.main_container, listFragment)
                    commit()
                }
    }

    override fun openDetails() {
        supportFragmentManager.beginTransaction()
                .apply {
                    remove(listFragment)
                    add(R.id.main_container, detailsFragment)
                    commit()
                }
    }
}