package com.andrecoulson.themovieadb.ui.detail

import com.andrecoulson.themovieadb.base.BasePresenter
import com.andrecoulson.themovieadb.network.ImdbApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class DetailPresenter(iDetailView: IDetailView) : BasePresenter<IDetailView>(iDetailView) {


    @Inject
    lateinit var imdbApi: ImdbApi

    private var subbscription: Disposable? = null


    override fun onViewCreated() {
    }


    fun loadMovieById(id: String) {
        subbscription = imdbApi.getMovieId(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe()
    }

    fun loadVideosById(id:String){
        subbscription = imdbApi.getVideosMovieId(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe()
    }

    override fun onViewDestroyed() {
        subbscription?.dispose()
    }
}