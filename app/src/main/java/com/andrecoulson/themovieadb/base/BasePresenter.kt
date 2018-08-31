package com.andrecoulson.themovieadb.base

import com.andrecoulson.themovieadb.injection.component.DaggerPresenterInjector
import com.andrecoulson.themovieadb.injection.component.PresenterInjector
import com.andrecoulson.themovieadb.injection.module.ContextModule
import com.andrecoulson.themovieadb.injection.module.NetworkModule
import com.andrecoulson.themovieadb.ui.detail.DetailPresenter
import com.andrecoulson.themovieadb.ui.main.MainPresenter


abstract class BasePresenter<out V : BaseView>(protected val view: V) {

    private val injector: PresenterInjector = DaggerPresenterInjector
            .builder()
            .baseView(view)
            .contextModule(ContextModule)
            .networkModule(NetworkModule)
            .build()


    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is MainPresenter -> injector.inject(this)
            is DetailPresenter->injector.inject(this)
        }
    }

    open fun onViewCreated() {}

    open fun onViewDestroyed() {}
}