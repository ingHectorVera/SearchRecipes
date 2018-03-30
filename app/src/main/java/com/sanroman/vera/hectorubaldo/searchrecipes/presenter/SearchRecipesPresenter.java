package com.sanroman.vera.hectorubaldo.searchrecipes.presenter;


import com.sanroman.vera.hectorubaldo.searchrecipes.contract.SearchContract;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hits;
import com.sanroman.vera.hectorubaldo.searchrecipes.model.SearchRecipesModel;

public class SearchRecipesPresenter implements SearchContract.Presenter{

    private SearchContract.View view;
    private SearchContract.Model model;

    public SearchRecipesPresenter (SearchContract.View view) {
        this.view = view;
        model = new SearchRecipesModel(this);
    }
    @Override
    public void showRecipes(Hits hits) {
        if (view != null) {
            view.showRecipes(hits);
        }
    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void searchRecipes(String data) {
        if (view != null) {
            model.searchRecipes(data);
        }
    }
}
