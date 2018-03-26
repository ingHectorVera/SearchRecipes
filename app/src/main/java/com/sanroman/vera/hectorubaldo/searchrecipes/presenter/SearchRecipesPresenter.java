package com.sanroman.vera.hectorubaldo.searchrecipes.presenter;


import com.sanroman.vera.hectorubaldo.searchrecipes.contract.SearchContract;
import com.sanroman.vera.hectorubaldo.searchrecipes.model.SearchRecipesModel;

public class SearchRecipesPresenter implements SearchContract.Presenter{

    private SearchContract.View view;
    private SearchContract.Model model;

    public SearchRecipesPresenter (SearchContract.View view) {
        this.view = view;
        model = new SearchRecipesModel(this);
    }
    @Override
    public void showRecipes(String data) {

    }

    @Override
    public void searchRecipes(String data) {

    }
}
