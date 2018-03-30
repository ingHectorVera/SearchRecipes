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
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hits;
import com.sanroman.vera.hectorubaldo.searchrecipes.presenter.SearchRecipesPresenter;
import com.sanroman.vera.hectorubaldo.searchrecipes.view.recyclerView.RVRecipesAdapter;

public class SearchView extends AppCompatActivity implements SearchContract.View, View.OnClickListener {

    private EditText eSearchRecipes;
    private Button bSearchRecipes;
    private TextView tSearchResult;
    private RecyclerView rv_recipes;
    private RecyclerView.Adapter rvAdapter;
    private RecyclerView.LayoutManager rvLayoutManager;
    private SearchContract.Presenter presenter;
    private int count, to, from;
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);

        setUI();
    }

    @Override
    public void showRecipes(Hits hits) {
        data = hits.getQ();
        count = hits.getCount();
        to = hits.getTo();
        from = hits.getFrom();
        tSearchResult.setText("Search: "+data+" From: "+ from +" To: " +to+" Count: "+count);

        //rv_recipes.setHasFixedSize(true);
        rvLayoutManager = new GridLayoutManager(getApplicationContext(), 3);
        rv_recipes.setLayoutManager(rvLayoutManager);

        rvAdapter = new RVRecipesAdapter(hits);
        rv_recipes.setAdapter(rvAdapter);
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
        count = 0;
        to = 0;
        from = 0;
        data = null;
        eSearchRecipes = (EditText) findViewById(R.id.eSearchRecipes);
        tSearchResult = (TextView) findViewById(R.id.tSearchResult);
        bSearchRecipes = (Button) findViewById(R.id.bSearchRecipes);
        bSearchRecipes.setOnClickListener(this);

        rv_recipes = (RecyclerView) findViewById(R.id.rv_recipes);

        presenter = new SearchRecipesPresenter(this);
    }
}
