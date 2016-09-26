package com.example.algomez.retrofitexample;

import com.example.algomez.retrofitexample.model.PokemonModel;
import com.example.algomez.retrofitexample.rest.PokemonService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by algomez on 9/25/16.
 */
public class MainPresenter {

  private MainView view;
  private MainAction action;
  private PokemonService service;

  public MainPresenter(MainView view) {
    this.view = view;
  }

  public void setService(PokemonService service) {
    this.service = service;
  }

  public void getInformation(int number){
    view.hideKeyboard();
    view.showLoader();
    Call<PokemonModel> result = service.getPokemon(number);
    result.enqueue(new Callback<PokemonModel>() {
      @Override public void onResponse(Call<PokemonModel> call, Response<PokemonModel> response) {
        if (response.code() == 200) {
          view.showResult(response);
        } else {
          view.showError(response.message());
        }
        view.hideLoader();
      }

      @Override public void onFailure(Call<PokemonModel> call, Throwable t) {

      }
    });
  }

  interface MainView{
    void showLoader();
    void hideLoader();
    void hideKeyboard();
    void showResult(Response<PokemonModel> response);
    void showError(String error);
  }

}
