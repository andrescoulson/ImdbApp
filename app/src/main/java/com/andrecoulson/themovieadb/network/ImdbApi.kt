package com.andrecoulson.themovieadb.network

import com.andrecoulson.themovieadb.model.ResponseDetail
import com.andrecoulson.themovieadb.model.ResponseMovie
import com.andrecoulson.themovieadb.model.ResponseVideoMovie
import com.andrecoulson.themovieadb.utils.ApiConstants
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path


interface ImdbApi {

    @GET(ApiConstants.GET_MOVIE_POPULAR)
    fun getPopularMovies(): Observable<ResponseMovie>

    @GET(ApiConstants.GET_MOVIE_BY_ID)
    fun getMovieId(@Path("movie_id") id: String): Observable<ResponseDetail>

    @GET(ApiConstants.GET_VIDEO_MOVIE_BY_ID)
    fun getVideosMovieId(@Path("movie_id") id: String): Observable<ResponseVideoMovie>
}