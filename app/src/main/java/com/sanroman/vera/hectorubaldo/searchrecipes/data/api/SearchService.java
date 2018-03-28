package com.sanroman.vera.hectorubaldo.searchrecipes.data.api;

import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hits;
import com.sanroman.vera.hectorubaldo.searchrecipes.utilities.Constants;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SearchService {

    @GET ("/search?app_id="+ Constants.API_ID+"&app_key="+Constants.API_KEY+"&q={query}")
    Call<List<Hits>> getRecipes(@Path("query") String query);
}
