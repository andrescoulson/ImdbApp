package com.andrecoulson.themovieadb.ui.detail

import com.andrecoulson.themovieadb.R
import com.andrecoulson.themovieadb.base.BasePresenter
import com.andrecoulson.themovieadb.model.ResponseDetail
import com.andrecoulson.themovieadb.network.ImdbApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class DetailPresenter(iDetailView: IDetailView) : BasePresenter<IDetailView>(iDetailView) {


    @Inject
    lateinit var imdbApi: ImdbApi

    private var subbscription: Disposable? = null

    override fun onViewCreated() {}

    fun loadMovieById(id: String) {
        subbscription = imdbApi.getMovieId(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ t: ResponseDetail? -> view.updateMovie(t) },
                        { t -> view.showErrorVideo(R.string.error_movies) })
    }

    fun loadVideosById(id: String) {
        subbscription = imdbApi.getVideosMovieId(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ t -> view.updateVideo(t.results) },
                        { view.showErrorVideo(R.string.video_not_found) })
    }

    override fun onViewDestroyed() {
        subbscription?.dispose()
    }
}