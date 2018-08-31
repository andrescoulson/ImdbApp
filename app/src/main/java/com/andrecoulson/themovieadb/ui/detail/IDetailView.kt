package com.andrecoulson.themovieadb.ui.detail

import android.support.annotation.StringRes
import com.andrecoulson.themovieadb.base.BaseView
import com.andrecoulson.themovieadb.model.ResponseDetail
import com.andrecoulson.themovieadb.model.VideosMovie


interface IDetailView :BaseView {

    fun updateMovie(movie:ResponseDetail?)

    fun updateVideo(videos:List<VideosMovie>?)

    fun showErrorVideo(err:String)

    fun showErrorVideo(@StringRes err: Int) {
        this.showErrorVideo(getcContext().getString(err))
    }
}