package com.sanroman.vera.hectorubaldo.searchrecipes.data.api;

import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hits;
import com.sanroman.vera.hectorubaldo.searchrecipes.utilities.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchService {

    @GET ("/search?app_id="+ Constants.API_ID+"&app_key="+Constants.API_KEY)
    Call<Hits> getRecipes(@Query("q") String query);


    @GET ("/search?app_id="+ Constants.API_ID+"&app_key="+Constants.API_KEY)
    Call<Hits> getRecipesFromTo(@Query("q") String query, @Query("from") int from, @Query("to") int to);
}
