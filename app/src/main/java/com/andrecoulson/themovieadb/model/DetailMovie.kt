package com.andrecoulson.themovieadb.model



data class ResponseDetail(
		val adult: Boolean, //false
		val backdrop_path: String, ///3P52oz9HPQWxcwHOwxtyrVV1LKi.jpg
		val belongs_to_collection: BelongsToCollection,
		val budget: Int, //110000000
		val genres: List<Genre>,
		val homepage: String, //https://www.foxmovies.com/movies/deadpool-2
		val id: Int, //383498
		val imdb_id: String, //tt5463162
		val original_language: String, //en
		val original_title: String, //Deadpool 2
		val overview: String, //Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life.
		val popularity: Double, //189.592
		val poster_path: String?, ///to0spRl1CMDvyUbOnbb4fTk3VAd.jpg
		val production_companies: List<ProductionCompany>,
		val production_countries: List<ProductionCountry>,
		val release_date: String, //2018-05-15
		val revenue: Int, //732419226
		val runtime: Int, //121
		val spoken_languages: List<SpokenLanguage>,
		val status: String, //Released
		val tagline: String, //Prepare for the Second Coming.
		val title: String, //Deadpool 2
		val video: Boolean, //false
		val vote_average: Double, //7.5
		val vote_count: Int //4356
)

data class BelongsToCollection(
		val id: Int, //448150
		val name: String, //Deadpool Collection
		val poster_path: String, ///30c5jO7YEXuF8KiWXLg9m28GWDA.jpg
		val backdrop_path: String ///dTq7mGyAR5eAydR532feWfjJjzm.jpg
)

data class SpokenLanguage(
		val iso_639_1: String, //en
		val name: String //English
)

data class ProductionCompany(
		val id: Int, //28788
		val logo_path: Any, //null
		val name: String, //Genre Films
		val origin_country: String //US
)

data class ProductionCountry(
		val iso_3166_1: String, //US
		val name: String //United States of America
)

data class Genre(
		val id: Int, //28
		val name: String //Action
)