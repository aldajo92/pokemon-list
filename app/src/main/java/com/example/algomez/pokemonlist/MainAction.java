package com.example.algomez.pokemonlist;

import com.example.algomez.pokemonlist.model.PokemonModel;
import com.example.algomez.pokemonlist.rest.ApiClient;
import com.example.algomez.pokemonlist.rest.PokemonService;
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
