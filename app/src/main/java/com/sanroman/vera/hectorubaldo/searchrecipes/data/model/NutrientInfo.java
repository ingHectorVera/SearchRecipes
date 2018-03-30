package com.sanroman.vera.hectorubaldo.searchrecipes.data.model;

import java.io.Serializable;

public class NutrientInfo implements Serializable{

    private String uri, label, unit;
    private float quantity;

    public NutrientInfo(String uri, String label, String unit, float quantity) {
        this.uri = uri;
        this.label = label;
        this.unit = unit;
        this.quantity = quantity;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "NutrientInfo{" +
                "uri='" + uri + '\'' +
                ", label='" + label + '\'' +
                ", unit='" + unit + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
