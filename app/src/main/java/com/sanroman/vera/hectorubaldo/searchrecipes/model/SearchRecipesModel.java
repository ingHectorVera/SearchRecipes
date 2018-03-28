package com.sanroman.vera.hectorubaldo.searchrecipes.model;


import com.sanroman.vera.hectorubaldo.searchrecipes.contract.SearchContract;
import com.sanroman.vera.hectorubaldo.searchrecipes.presenter.SearchRecipesPresenter;

public class SearchRecipesModel implements SearchContract.Model{

    private SearchContract.Presenter presenter;

    public SearchRecipesModel(SearchRecipesPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void searchRecipes(String data) {

        presenter.showRecipes(data);
    }
}
