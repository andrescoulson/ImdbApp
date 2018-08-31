package com.andrecoulson.themovieadb.utils

import android.databinding.BindingAdapter
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.andrecoulson.themovieadb.ui.main.MovieAdapter
import com.bumptech.glide.Glide

@BindingAdapter("image")
fun loadPoster(imageView: ImageView, url: String?) {
    Glide.with(imageView.context)
            .load(ApiConstants.IMAGE_URL + url)
            .into(imageView)
}

@BindingAdapter("image_url")
fun loadImage(imageView: ImageView, url: String?) {
    Glide.with(imageView.context)
            .load(ApiConstants.IMAGE_URL + url)
            .into(imageView)
}


@BindingAdapter("adapter")
fun setAdapter(view: RecyclerView, adapter: MovieAdapter) {
    view.adapter = adapter
}

@BindingAdapter("layoutManager")
fun setLayoutManager(view: RecyclerView, layoutManager: RecyclerView.LayoutManager) {
    view.layoutManager = layoutManager
}


@BindingAdapter("dividerItemDecoration")
fun setDividerItemDecoration(view: RecyclerView, dividerItemDecoration: DividerItemDecoration) {
    view.addItemDecoration(dividerItemDecoration)
}
