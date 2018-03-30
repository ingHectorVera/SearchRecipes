package com.sanroman.vera.hectorubaldo.searchrecipes.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sanroman.vera.hectorubaldo.searchrecipes.R;
import com.sanroman.vera.hectorubaldo.searchrecipes.contract.SearchContract;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hits;
import com.sanroman.vera.hectorubaldo.searchrecipes.presenter.SearchRecipesPresenter;

public class SearchView extends AppCompatActivity implements SearchContract.View, View.OnClickListener {

    private EditText eSearchRecipes;
    private Button bSearchRecipes;
    private TextView tSearchResult;
    private SearchContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);

        setUI();
    }

    @Override
    public void showRecipes(Hits hits) {
        tSearchResult.setText(hits.toString());
    }

    @Override
    public void showError(String error) {

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
        eSearchRecipes = (EditText) findViewById(R.id.eSearchRecipes);
        tSearchResult = (TextView) findViewById(R.id.tSearchResult);
        bSearchRecipes = (Button) findViewById(R.id.bSearchRecipes);
        bSearchRecipes.setOnClickListener(this);

        presenter = new SearchRecipesPresenter(this);
    }
}
