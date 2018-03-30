package com.sanroman.vera.hectorubaldo.searchrecipes.view.recyclerView;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.sanroman.vera.hectorubaldo.searchrecipes.R;
import com.sanroman.vera.hectorubaldo.searchrecipes.contract.SearchContract;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hit;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hits;
import com.sanroman.vera.hectorubaldo.searchrecipes.view.RecipeDetailsActivity;

import java.util.ArrayList;

public class RVRecipesAdapter extends RecyclerView.Adapter<RVRecipesAdapter.HitsHolder> {

    private Hits hits;
    private ArrayList<Hit> lHits;
    private View view;

    public RVRecipesAdapter(Hits hits) {
        this.hits = hits;
        lHits = (ArrayList<Hit>) this.hits.getHits();
    }
    @Override
    public RVRecipesAdapter.HitsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_recipe_view, parent,false);
        return new HitsHolder(view);
    }

    @Override
    public void onBindViewHolder(HitsHolder holder, int position) {
        Hit hit = lHits.get(position);
        String uriImage = hit.getRecipe().getImage();

        Glide.with(view.getContext())
                .load(uriImage)
                .into(holder.iv_recipe);
    }

    @Override
    public int getItemCount() {
        return lHits.size();
    }

    public class HitsHolder extends RecyclerView.ViewHolder {
        ImageView iv_recipe;
        public HitsHolder(View itemView) {
            super(itemView);

            iv_recipe = (ImageView) itemView.findViewById(R.id.iv_recipe);

            iv_recipe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    Hit hit = lHits.get(pos);
                    Intent intent = new Intent(v.getContext(), RecipeDetailsActivity.class);
                    intent.putExtra("hit", hit);
                    v.getContext().startActivity(intent);
                    Toast.makeText(v.getContext(), "Position: "+ pos, Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
