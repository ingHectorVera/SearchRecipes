package com.sanroman.vera.hectorubaldo.searchrecipes.data.model;

import android.util.Log;


import retrofit2.Call;
import retrofit2.Callback;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.api.SearchRecipeFactory;

import java.util.List;
import retrofit2.Response;

public class SearchRecipeAPIModel {

    public static void searchRecipeQueryCallable(String query) {

        SearchRecipeFactory.getInstance().getRecipes(query).enqueue(new Callback<Hits>() {
            @Override
            public void onResponse(Call<Hits> call, Response<Hits> response) {
                Hits hits = response.body();
                Log.d("DEBUG", "onResponse: "+ response.raw());
                Log.d("DEBUG", "onResponse: " + hits.toString());
            }

            @Override
            public void onFailure(Call<Hits> call, Throwable t) {
                Log.d("DEBUG", "onFailure: " + t.getMessage());

            }
        });
    }

    public static void searchRecipeFromToCallable(String query, int from, int to) {
        SearchRecipeFactory.getInstance().getRecipesFromTo(query,from, to).enqueue(new Callback<Hits>() {
            @Override
            public void onResponse(Call<Hits> call, Response<Hits> response) {
                Hits hits = response.body();
                Log.d("DEBUG", "onResponse: "+ response.raw());
                Log.d("DEBUG", "onResponse: " + hits.toString());

            }

            @Override
            public void onFailure(Call<Hits> call, Throwable t) {
                Log.d("DEBUG", "onFailure: " + t.getMessage());
            }
        });
    }
}
