package com.sanroman.vera.hectorubaldo.searchrecipes.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sanroman.vera.hectorubaldo.searchrecipes.R;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hit;
import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Ingredient;

public class RecipeDetailsActivity extends AppCompatActivity {

    private Hit hit;
    private ImageView image_rd;
    private TextView tDetails, tIngredients, tSource, tLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);
        Intent intent = getIntent();
        hit = (Hit) intent.getSerializableExtra("hit");

        image_rd = (ImageView) findViewById(R.id.image_rd);
        tDetails = (TextView) findViewById(R.id.tDetails);
        tLabel = (TextView) findViewById(R.id.tLabel);
        tIngredients = (TextView) findViewById(R.id.tIngredients);
        tSource = (TextView) findViewById(R.id.tSource);

        Glide.with(getApplicationContext()).load(hit.getRecipe().getImage()).into(image_rd);
        tLabel.setText(hit.getRecipe().getLabel());
        tIngredients.setText(getIngredient(hit));
        tDetails.setText(hit.toString());
        tSource.setText(getSource(hit));
    }

    private String getIngredient(Hit hit) {
        StringBuilder sb = new StringBuilder();
        for(Ingredient i : hit.getRecipe().getIngredients()) {
            sb.append(i.toString() + "\n");
        }
        return sb.toString();
    }

    private String getSource(Hit hit) {
        return hit.getRecipe().getSource() + "\n"
                + hit.getRecipe().getUrl();
    }
}
