package com.example.algomez.pokemonlist;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.algomez.pokemonlist.model.PokemonModel;
import com.example.algomez.pokemonlist.rendering.PokemonAdapter;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements MainPresenter.MainView{

  @BindView(R.id.pokemon_list) RecyclerView recyclerView;
  @BindView(R.id.input_number) EditText inputNumber;

  private List<PokemonModel> list;
  private PokemonAdapter pAdapter;

  private MainPresenter presenter;
  private ProgressDialog progress;

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    initPresenter();
    initRecyclerView();
    initLoader();

    inputNumber.setOnEditorActionListener(new TextView.OnEditorActionListener() {
      @Override public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        if (actionId == EditorInfo.IME_ACTION_DONE) {
          onGetPokemonClicked();
        }
        return false;
      }
    });
  }

  @OnClick(R.id.get_pokemon_cta) public void onGetPokemonClicked() {
      presenter.getInformation();
  }

  public void initPresenter(){
    presenter = new MainPresenter(this);
  }

  public void initRecyclerView(){
    list = new ArrayList<>();
    pAdapter = new PokemonAdapter(list, getApplicationContext());
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(pAdapter);
  }

  public void initLoader(){
    progress = new ProgressDialog(this);
    progress.setTitle("Loading");
    progress.setMessage("Wait while loading...");
  }

  @Override public void showLoader() {
    progress.show();
  }

  @Override public void hideLoader() {
    progress.hide();
  }

  @Override public void hideKeyboard() {
    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
    imm.hideSoftInputFromWindow(inputNumber.getWindowToken(), 0);
    inputNumber.setText("");
  }

  @Override public void showResult(Response<PokemonModel> response) {
    PokemonModel pokemonModel = response.body();
    list.add(0, pokemonModel);
    pAdapter.notifyItemInserted(0);
    recyclerView.smoothScrollToPosition(0);
    recyclerView.invalidate();
  }

  @Override public void showError(String error) {
    Toast.makeText(getApplicationContext(), error, Toast.LENGTH_LONG).show();
  }

  @Override public String getEditText() {
    return inputNumber.getText().toString();
  }
}
