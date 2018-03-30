package com.sanroman.vera.hectorubaldo.searchrecipes.model;


import android.util.Log;

import com.sanroman.vera.hectorubaldo.searchrecipes.contract.SearchContract;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hits;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.SearchRecipeAPIModel;
import com.sanroman.vera.hectorubaldo.searchrecipes.listener.ResponseListener;
import com.sanroman.vera.hectorubaldo.searchrecipes.presenter.SearchRecipesPresenter;

public class SearchRecipesModel implements SearchContract.Model, ResponseListener{

    private SearchContract.Presenter presenter;

    public SearchRecipesModel(SearchRecipesPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void searchRecipes(String data) {
        SearchRecipeAPIModel searchRecipeAPIModel = new SearchRecipeAPIModel(this);
        searchRecipeAPIModel.searchRecipeQueryCallable(data);
        //presenter.showRecipes(data);
    }

    @Override
    public void sendHitsInformation(Hits hits) {
        Log.d("DEBUG: ", "sendHitsInformation: " + hits.toString());
        presenter.showRecipes(hits );
    }
}
