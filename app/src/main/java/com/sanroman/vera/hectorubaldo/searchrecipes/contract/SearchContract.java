package com.sanroman.vera.hectorubaldo.searchrecipes.contract;


public interface SearchContract {

    interface View {
        void showRecipes(String data);
        void showError(String error);
    }

    interface Presenter {
        void showRecipes(String data);
        void showError(String error);
        void searchRecipes(String data);
    }

    interface  Model {
        void searchRecipes(String data);
    }
}
