package com.sanroman.vera.hectorubaldo.searchrecipes.contract;


import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hits;

public interface SearchContract {

    interface View {
        void showRecipes(Hits hits);
        void showError(String error);
    }

    interface Presenter {
        void showRecipes(Hits hits);
        void showError(String error);
        void searchRecipes(String data);
    }

    interface  Model {
        void searchRecipes(String data);
    }
}
