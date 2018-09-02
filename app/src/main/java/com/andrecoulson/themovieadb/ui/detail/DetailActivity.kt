package com.andrecoulson.themovieadb.ui.detail

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.andrecoulson.themovieadb.R
import com.andrecoulson.themovieadb.base.BaseActivity
import com.andrecoulson.themovieadb.databinding.ActivityDetailBinding
import com.andrecoulson.themovieadb.model.ResponseDetail
import com.andrecoulson.themovieadb.model.VideosMovie

class DetailActivity : BaseActivity<DetailPresenter>(), IDetailView {


    lateinit var mBindig: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBindig = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        if (intent.extras != null) {
            val id = intent.extras.getString("id")
            presenter.loadMovieById(id)
            presenter.loadVideosById(id)
        }
    }

    override fun instantiatePresenter(): DetailPresenter {
        return DetailPresenter(this)
    }

    override fun updateMovie(movie: ResponseDetail?) {
        mBindig.movieDetail = movie
        mBindig.executePendingBindings()
    }

    override fun updateVideo(videos: List<VideosMovie>?) {
        if (videos!!.isNotEmpty()) {
            mBindig.video = videos!![0]
            mBindig.executePendingBindings()
            mBindig.txtTrailer.visibility = View.VISIBLE
        }

    }

    override fun showErrorVideo(err: String) {
        Toast.makeText(this, err, Toast.LENGTH_LONG).show()
        mBindig.txtTrailer.visibility = View.GONE
    }
}
