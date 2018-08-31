package com.andrecoulson.themovieadb.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


abstract class BaseActivity<P : BasePresenter<BaseView>> : BaseView, AppCompatActivity() {

    protected lateinit var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = instantiatePresenter()

    }

    protected abstract fun instantiatePresenter(): P

    override fun getcContext(): Context {
        return this
    }
}