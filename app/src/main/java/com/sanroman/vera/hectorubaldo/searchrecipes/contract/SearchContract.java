package com.sanroman.vera.hectorubaldo.searchrecipes.contract;


public interface SearchContract {

    interface View {
        void showRecipes(String data);
    }

    interface Presenter {
        void showRecipes(String data);
        void searchRecipes(String data);
    }

    interface  Model {
        void searchRecipes(String data);
    }
}
