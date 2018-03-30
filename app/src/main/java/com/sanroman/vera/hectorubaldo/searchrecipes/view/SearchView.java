package com.sanroman.vera.hectorubaldo.searchrecipes.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sanroman.vera.hectorubaldo.searchrecipes.R;
import com.sanroman.vera.hectorubaldo.searchrecipes.contract.SearchContract;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hit;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hits;
import com.sanroman.vera.hectorubaldo.searchrecipes.listener.EndlessScrollListener;
import com.sanroman.vera.hectorubaldo.searchrecipes.presenter.SearchRecipesPresenter;
import com.sanroman.vera.hectorubaldo.searchrecipes.view.recyclerView.RVRecipesAdapter;

import java.util.ArrayList;
import java.util.List;

public class SearchView extends AppCompatActivity implements SearchContract.View, View.OnClickListener {

    private EditText eSearchRecipes;
    private Button bSearchRecipes;
    private TextView tSearchResult;
    private RecyclerView rv_recipes;
    private RecyclerView.Adapter rvAdapter;
    private GridLayoutManager rvLayoutManager;
    private EndlessScrollListener scrollListener;
    private SearchContract.Presenter presenter;
    private int count, to, from, start;
    private String data;
    private Hits hits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);

        setUI();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("to", to);
        outState.putInt("from", from);
        outState.putString("data", data);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        this.to = savedInstanceState.getInt("to");
        this.from = savedInstanceState.getInt("from");
        this.data = savedInstanceState.getString("data");
        presenter.searchRecipes(data,start,to);
    }

    @Override
    public void showRecipes(Hits hits) {
        if (rvLayoutManager != null) {
            rvLayoutManager = null;
        }

        rvLayoutManager = new GridLayoutManager(getApplicationContext(), 3);
        rv_recipes.setLayoutManager(rvLayoutManager);

        if (hits.getFrom() == 0) {
            this.hits = hits;
            data = hits.getQ();
            count = hits.getCount();
            to = hits.getTo();
            from = hits.getFrom();
            tSearchResult.setText("Search: " + data + " From: " + from + " To: " + to + " Count: " + count);

            rvAdapter = new RVRecipesAdapter(hits);
            rv_recipes.setAdapter(rvAdapter);
        } else {
            this.data = hits.getQ();
            this.to = hits.getTo();
            this.from = hits.getFrom();
            List<Hit> lHit = this.hits.getHits();
            lHit.addAll(hits.getHits());
            this.hits.setHits(lHit);
            tSearchResult.setText("Search: " + data + " From: " + from + " To: " + to + " Count: " + count);

            rvAdapter.notifyDataSetChanged();
        }
        scrollListener = new EndlessScrollListener(rvLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                int newFrom = to +1;
                int newTo = newFrom + 10;
                presenter.searchRecipes(data, newFrom, newTo);
            }
        };
        rv_recipes.setOnScrollListener(scrollListener);
    }

    @Override
    public void showError(String error) {
        tSearchResult.setText("Error");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bSearchRecipes:
                String recipe = eSearchRecipes.getText().toString();
                presenter.searchRecipes(recipe);
                break;
        }

    }

    public void setUI() {
        start = 0;
        count = 0;
        to = 0;
        from = 0;
        data = null;
        eSearchRecipes = (EditText) findViewById(R.id.eSearchRecipes);
        tSearchResult = (TextView) findViewById(R.id.tSearchResult);
        bSearchRecipes = (Button) findViewById(R.id.bSearchRecipes);
        bSearchRecipes.setOnClickListener(this);

        rv_recipes = (RecyclerView) findViewById(R.id.rv_recipes);
        rv_recipes.setHasFixedSize(true);

        presenter = new SearchRecipesPresenter(this);
    }
}
