package com.example.lab09

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RecipeApiService {
    @GET("recipes")
    suspend fun getRecipes(): RecipeResponse

    @GET("recipes/{id}")
    suspend fun getRecipeById(@Path("id") id: Int): RecipeModel

    @GET("recipes/search")
    suspend fun searchRecipes(@Query("q") query: String): RecipeResponse
}
