package com.andrecoulson.themovieadb.ui.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import com.andrecoulson.themovieadb.R
import com.andrecoulson.themovieadb.base.BaseActivity
import com.andrecoulson.themovieadb.databinding.ActivityMainBinding
import com.andrecoulson.themovieadb.model.Movie

class MainActivity : BaseActivity<MainPresenter>(), IMainView {

    lateinit var mainBinding: ActivityMainBinding
    private var adapter = MovieAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainBinding.adapter = adapter
        mainBinding.layoutManager = LinearLayoutManager(this)
        mainBinding.dividerItemDecoration = DividerItemDecoration(this, LinearLayout.VERTICAL)
        presenter.onViewCreated()
    }


    override fun instantiatePresenter(): MainPresenter {
        return MainPresenter(this)
    }

    override fun updateMovies(movies: List<Movie>) {
        adapter.updateMovies(movies)
    }

    override fun showError(err: String) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show()
    }

    override fun showLoading() {
        mainBinding.progressVisibility = View.VISIBLE
    }

    override fun hideLoading() {
        mainBinding.progressVisibility = View.GONE

    }
}
