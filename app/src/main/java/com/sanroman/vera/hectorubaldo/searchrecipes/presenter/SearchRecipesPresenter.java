package com.sanroman.vera.hectorubaldo.searchrecipes.presenter;


import com.sanroman.vera.hectorubaldo.searchrecipes.contract.SearchContract;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hits;
import com.sanroman.vera.hectorubaldo.searchrecipes.model.SearchRecipesModel;

public class SearchRecipesPresenter implements SearchContract.Presenter{

    private SearchContract.View view;
    private SearchContract.Model model;

    public SearchRecipesPresenter () {
        model = new SearchRecipesModel();
        model.attach(this);
    }

    @Override
    public void attach(SearchContract.View view){
        this.view = view;

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

    @Override
    public void searchRecipes(String data, int from, int to) {
        model.searchRecipes(data, from, to);
    }
}
