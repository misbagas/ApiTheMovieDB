package com.example.apithemoviedb.network

object TMDBApi {
    fun getMovie(): String{
        return BASE_URL + API_KEY
    }
}