package com.example.numberskotlin.api

import com.example.numberskotlin.model.Trivia
import retrofit2.Call
import retrofit2.http.GET


public interface NumbersApiService {

    // The GET method needed to retrieve a random number trivia.
    @GET("/random/trivia?json")
    fun getRandomNumberTrivia(): Call<Trivia>
}