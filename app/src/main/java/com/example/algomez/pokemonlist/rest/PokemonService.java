package com.example.algomez.pokemonlist.rest;

import com.example.algomez.pokemonlist.model.PokemonModel;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokemonService {
  @GET("pokemon-form/{number}") Call<ResponseBody> getPokemonBody(@Path("number") int number);
  @GET("pokemon-form/{number}") Call<PokemonModel> getPokemon(@Path("number") int number);
}