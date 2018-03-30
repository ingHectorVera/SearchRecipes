package com.sanroman.vera.hectorubaldo.searchrecipes.di;

import com.sanroman.vera.hectorubaldo.searchrecipes.model.SearchRecipesModel;
import com.sanroman.vera.hectorubaldo.searchrecipes.presenter.SearchRecipesPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class SearchModule {
    @Provides
    public SearchRecipesPresenter providesSearchRecipesPresenter(){
        return new SearchRecipesPresenter();
    }

    @Provides
    public SearchRecipesModel providesSearchRecipesModel() {
        return new SearchRecipesModel();
    }
}
