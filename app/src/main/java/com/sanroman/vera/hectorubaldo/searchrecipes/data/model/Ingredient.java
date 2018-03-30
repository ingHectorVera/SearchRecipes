package com.sanroman.vera.hectorubaldo.searchrecipes.data.model;

import java.io.Serializable;

public class Ingredient implements Serializable{

    private String uri;
    private float quantity;
    private Measure measure;
    private float weight;
    private Food food;

    public Ingredient(String uri, float quantity, Measure measure, float weight, Food food) {
        this.uri = uri;
        this.quantity = quantity;
        this.measure = measure;
        this.weight = weight;
        this.food = food;
    }


    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "uri='" + uri + '\'' +
                ", quantity=" + quantity +
                ", measure=" + measure +
                ", weight=" + weight +
                ", food=" + food +
                '}';
    }
}
