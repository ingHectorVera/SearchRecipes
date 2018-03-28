package com.sanroman.vera.hectorubaldo.searchrecipes.data.api;

import com.sanroman.vera.hectorubaldo.searchrecipes.utilities.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchRecipeFactory {

    private static SearchService searchService;

    public static SearchService getInstance() {
        if (searchService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(Constants.API_SEARCH_BASE_URL)
                    .build();
            searchService = retrofit.create(SearchService.class);
            return searchService;
        } else {
            return searchService;
        }
    }
}
