package com.andrecoulson.themovieadb.utils


class ApiConstants {

    companion object {
        const val API_KEY:String = "de9cb25b9b0bba7d160bfe472ebf55a3"
        const val URL_BASE:String = "https://api.themoviedb.org/3/"
        const val GET_MOVIE_POPULAR:String = "movie/popular?api_key=$API_KEY"
        const val GET_MOVIE_BY_ID:String = "movie/{movie_id}?api_key=$API_KEY"
        const val GET_VIDEO_MOVIE_BY_ID:String = "movie/{movie_id}/videos?api_key=$API_KEY"
        const val IMAGE_URL:String = "https://image.tmdb.org/t/p/original/"
    }
}