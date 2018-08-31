package com.andrecoulson.themovieadb.model


data class ResponseVideoMovie(
		val id: Int, //383498
		val results: List<VideosMovie>
)

data class VideosMovie(
		val id: String, //58cfd30ec3a36850fb033b0f
		val iso_639_1: String, //en
		val iso_3166_1: String, //US
		val key: String, //Z5ezsReZcxU
		val name: String, //No Good Deed
		val site: String, //YouTube
		val size: Int, //1080
		val type: String //Featurette
)