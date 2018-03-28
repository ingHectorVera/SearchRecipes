package com.sanroman.vera.hectorubaldo.searchrecipes.data.api;

import com.sanroman.vera.hectorubaldo.searchrecipes.utilities.Constants;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SearchService {

    @GET ("/search?app_id="+ Constants.API_ID+"&app_key="+Constants.API_KEY+"&q={query}")
    void getRecipes(@Path("query") String query);
}
