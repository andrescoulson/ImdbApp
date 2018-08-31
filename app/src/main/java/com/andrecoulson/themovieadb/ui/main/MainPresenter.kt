package com.andrecoulson.themovieadb.ui.main

import com.andrecoulson.themovieadb.R
import com.andrecoulson.themovieadb.base.BasePresenter
import com.andrecoulson.themovieadb.network.ImdbApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class MainPresenter(mainView: IMainView) : BasePresenter<IMainView>(mainView) {

    @Inject
    lateinit var imdbApi: ImdbApi

    private var subbscription: Disposable? = null

    override fun onViewCreated() {
        loadMovies()
    }

    private fun loadMovies() {
        view.showLoading()
        subbscription = imdbApi
                .getPopularMovies()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .doOnTerminate { view.hideLoading() }
                .subscribe(
                        { t -> view.updateMovies(t.results) },
                        { view.showError(R.string.error_movies) }
                )
    }

    override fun onViewDestroyed() {
        subbscription?.dispose()
    }
}