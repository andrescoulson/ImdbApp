package com.andrecoulson.themovieadb.ui.main

import android.support.annotation.StringRes
import com.andrecoulson.themovieadb.base.BaseView
import com.andrecoulson.themovieadb.model.Movie


interface IMainView : BaseView {

    fun updateMovies(movies: List<Movie>)

    fun showError(err: String)

    fun showError(@StringRes err: Int) {
        this.showError(getcContext().getString(err))
    }

    fun showLoading()

    fun hideLoading()

}