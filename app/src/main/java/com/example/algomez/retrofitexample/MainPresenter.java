package com.example.algomez.retrofitexample;

import com.example.algomez.retrofitexample.model.PokemonModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {

  private final MainView view;
  private MainAction action;

  public MainPresenter(MainView view) {
    this.view = view;
    action = new MainAction();
  }

  public void getInformation() {
    view.hideKeyboard();
    view.showLoader();
    String number = view.getEditText();
    if (!number.equals("")) {
      int num = Integer.parseInt(number);

      action.getPokemon(num).enqueue(new Callback<PokemonModel>() {
        @Override public void onResponse(Call<PokemonModel> call, Response<PokemonModel> response) {
          if (response.code() == 200) {
            view.showResult(response);
          } else {
            view.showError(response.message());
          }
          view.hideLoader();
        }

        @Override public void onFailure(Call<PokemonModel> call, Throwable t) {
          view.showError(t.getMessage());
        }
      });
    }
  }

  interface MainView {
    void showLoader();

    void hideLoader();

    void hideKeyboard();

    void showResult(Response<PokemonModel> response);

    void showError(String error);

    String getEditText();
  }
}
