package com.sanroman.vera.hectorubaldo.searchrecipes.di;

import com.sanroman.vera.hectorubaldo.searchrecipes.presenter.SearchRecipesPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class SearchModule {
    @Provides
    public SearchRecipesPresenter providesSearchRecipesPresenter(){
        return new SearchRecipesPresenter();
    }
}
