package ru.ershovao.moviesapp.data.network

import retrofit2.Response
import retrofit2.http.GET
import ru.ershovao.moviesapp.data.models.MovieModel

interface ApiService {

    @GET("/titles")
    suspend fun getAllMovies(): Response<List<MovieModel>>
}