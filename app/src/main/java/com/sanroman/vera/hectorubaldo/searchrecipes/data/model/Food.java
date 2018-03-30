package com.sanroman.vera.hectorubaldo.searchrecipes.data.model;

import java.io.Serializable;

public class Food implements Serializable{

    private String uri, label;

    public Food(String uri, String label) {
        this.uri = uri;
        this.label = label;
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

    @Override
    public String toString() {
        return "Food{" +
                "uri='" + uri + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
