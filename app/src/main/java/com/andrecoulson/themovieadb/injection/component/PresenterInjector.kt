package com.andrecoulson.themovieadb.injection.component

import com.andrecoulson.themovieadb.base.BasePresenter
import com.andrecoulson.themovieadb.base.BaseView
import com.andrecoulson.themovieadb.injection.module.ContextModule
import com.andrecoulson.themovieadb.injection.module.NetworkModule
import com.andrecoulson.themovieadb.ui.detail.DetailPresenter
import com.andrecoulson.themovieadb.ui.main.MainPresenter
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [(ContextModule::class), (NetworkModule::class)])
interface PresenterInjector {

    fun inject(mainPresenter: MainPresenter)
    fun inject(detailPresenter: DetailPresenter)

    @Component.Builder
    interface Builder {

        fun build(): PresenterInjector

        fun networkModule(networkModule: NetworkModule): Builder
        fun contextModule(contextModule: ContextModule): Builder

        @BindsInstance
        fun baseView(baseView: BaseView): Builder
    }
}