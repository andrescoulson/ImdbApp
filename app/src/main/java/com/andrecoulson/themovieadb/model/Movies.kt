package com.andrecoulson.themovieadb.model



data class ResponseMovie(
        val page: Int, //1
        val total_results: Int, //19786
        val total_pages: Int, //990
        val results: List<Movie>
)

data class Movie(
        val vote_count: Int, //7370
        val id: Int, //299536
        val video: Boolean, //false
        val vote_average: Double, //8.3
        val title: String, //Avengers: Infinity War
        val popularity: Double, //253.501
        val poster_path: String, ///7WsyChQLEftFiDOVTGkv3hFpyyt.jpg
        val original_language: String, //en
        val original_title: String, //Avengers: Infinity War
        val genre_ids: List<Int>,
        val backdrop_path: String, ///bOGkgRGdhrBYJSLpXaxhXVstddV.jpg
        val adult: Boolean, //false
        val overview: String, //As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.
        val release_date: String //2018-04-25
)