package com.sanroman.vera.hectorubaldo.searchrecipes.data.model;

import com.sanroman.vera.hectorubaldo.searchrecipes.data.api.SearchRecipeFactory;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchRecipeAPIModel {

    public static void searchRecipeQueryCallable(String query) {

        SearchRecipeFactory.getInstance().getRecipes(query).enqueue(new Callback<List<Hits>>() {
            @Override
            public void onResponse(Call<List<Hits>> call, Response<List<Hits>> response) {

            }

            @Override
            public void onFailure(Call<List<Hits>> call, Throwable t) {

            }
        });
    }
}
