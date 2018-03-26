package com.sanroman.vera.hectorubaldo.searchrecipes.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sanroman.vera.hectorubaldo.searchrecipes.R;
import com.sanroman.vera.hectorubaldo.searchrecipes.contract.SearchContract;

public class SearchView extends AppCompatActivity implements SearchContract.View, View.OnClickListener {

    private EditText eSearchRecipes;
    private Button bSearchRecipes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);

        setUI();
    }

    @Override
    public void showRecipes() {

    }

    @Override
    public void onClick(View v) {

    }

    public void setUI() {

    }
}
