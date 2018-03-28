package com.sanroman.vera.hectorubaldo.searchrecipes.data.model;

public class Recipe {

    private String uri, label, image, source, url;
    private int yield;
    private float calories, totalWeight;
    private Ingredient[] ingredients;
    private NutrientInfo[] totalNutrients, totalDaily;

    public Recipe(String uri, String label, String image, String source, String url, int yield,
                  float calories, float totalWeight, Ingredient[] ingredients, NutrientInfo[] totalNutrients,
                  NutrientInfo[] totalDaily) {
        this.uri = uri;
        this.label = label;
        this.image = image;
        this.source = source;
        this.url = url;
        this.yield = yield;
        this.calories = calories;
        this.totalWeight = totalWeight;
        this.ingredients = ingredients;
        this.totalNutrients = totalNutrients;
        this.totalDaily = totalDaily;
    }


    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getYield() {
        return yield;
    }

    public void setYield(int yield) {
        this.yield = yield;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(float totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public NutrientInfo[] getTotalNutrients() {
        return totalNutrients;
    }

    public void setTotalNutrients(NutrientInfo[] totalNutrients) {
        this.totalNutrients = totalNutrients;
    }

    public NutrientInfo[] getTotalDaily() {
        return totalDaily;
    }

    public void setTotalDaily(NutrientInfo[] totalDaily) {
        this.totalDaily = totalDaily;
    }
}
