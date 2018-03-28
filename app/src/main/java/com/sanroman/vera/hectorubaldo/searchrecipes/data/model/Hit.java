package com.sanroman.vera.hectorubaldo.searchrecipes.data.model;

public class Hit {

    private Recipe recipe;
    private boolean bookmarked, bought;

    public Hit(Recipe recipe, boolean bookmarked, boolean bought) {
        this.recipe = recipe;
        this.bookmarked = bookmarked;
        this.bought = bought;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public boolean isBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }
}
