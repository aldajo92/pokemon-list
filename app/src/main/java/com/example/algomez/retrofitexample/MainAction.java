package com.example.algomez.retrofitexample;

import com.example.algomez.retrofitexample.model.PokemonModel;
import com.example.algomez.retrofitexample.rest.ApiClient;
import com.example.algomez.retrofitexample.rest.PokemonService;
import retrofit2.Call;

public class MainAction {

  private PokemonService service;

  public MainAction() {
    service = ApiClient.getClient().create(PokemonService.class);
  }

  public Call<PokemonModel> getPokemon(int num){
    Call<PokemonModel> result = service.getPokemon(num);
    return result;
  }

}
