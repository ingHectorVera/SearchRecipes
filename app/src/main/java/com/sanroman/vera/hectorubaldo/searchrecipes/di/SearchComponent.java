package com.sanroman.vera.hectorubaldo.searchrecipes.di;

import com.sanroman.vera.hectorubaldo.searchrecipes.model.SearchRecipesModel;
import com.sanroman.vera.hectorubaldo.searchrecipes.presenter.SearchRecipesPresenter;
import com.sanroman.vera.hectorubaldo.searchrecipes.view.SearchView;

import dagger.Component;

@Component(modules = SearchModule.class)
public interface SearchComponent {
    void inject(SearchView searchView);
    void injectModel(SearchRecipesPresenter presenter);
}
