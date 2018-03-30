package com.sanroman.vera.hectorubaldo.searchrecipes.di;

import com.sanroman.vera.hectorubaldo.searchrecipes.view.SearchView;

import dagger.Component;

@Component(modules = SearchModule.class)
public interface SearchComponent {
    void inject(SearchView searchView);
}
