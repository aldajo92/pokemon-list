package com.example.algomez.retrofitexample.rendering;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.algomez.retrofitexample.R;
import com.example.algomez.retrofitexample.model.PokemonModel;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {

  private List<PokemonModel> list;
  private Context context;

  public static class PokemonViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.pokemon_name) TextView pokemonName;
    @BindView(R.id.pokemon_number) TextView pokemonNumber;
    @BindView(R.id.pokemon_image_back) ImageView pokemonImageBack;
    @BindView(R.id.pokemon_image_front) ImageView pokemonImageFront;

    public PokemonViewHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
    }
  }

  public PokemonAdapter(List<PokemonModel> list, Context context) {
    this.list = list;
    this.context = context;
  }

  @Override public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
    return new PokemonViewHolder(view);
  }

  @Override public void onBindViewHolder(PokemonViewHolder holder, int position) {
    holder.pokemonName.setText(StringUtils.capitalize(list.get(position).getName()));
    holder.pokemonNumber.setText(String.valueOf(list.get(position).getId()));
    BitmapWorkerTask task_back = new BitmapWorkerTask(holder.pokemonImageBack);
    task_back.execute(list.get(position).getSprites().getBackDefault());
    BitmapWorkerTask task = new BitmapWorkerTask(holder.pokemonImageFront);
    task.execute(list.get(position).getSprites().getFrontDefault());
  }

  @Override public int getItemCount() {
    return list.size();
  }

}
