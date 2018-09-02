package com.andrecoulson.themovieadb.ui.main

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.andrecoulson.themovieadb.R
import com.andrecoulson.themovieadb.databinding.ItemMovieBinding
import com.andrecoulson.themovieadb.model.Movie
import com.andrecoulson.themovieadb.ui.detail.DetailActivity


class MovieAdapter(private val context: Context) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    private var movies: List<Movie> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(DataBindingUtil.inflate<ItemMovieBinding>(layoutInflater, R.layout.item_movie, parent, false))
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
        holder.itemView?.setOnClickListener({
            context.startActivity(Intent(context, DetailActivity::class.java)
                    .putExtra("image", movie.poster_path)
                    .putExtra("title", movie.title)
                    .putExtra("overview", movie.overview)
                    .putExtra("release_date", movie.release_date)
                    .putExtra("id", movie.id.toString()))
        })
    }

    fun updateMovies(list: List<Movie>) {
        this.movies = list
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding?.root) {
        fun bind(movie: Movie) {
            binding.movie = movie
            binding.executePendingBindings()
        }

    }
}