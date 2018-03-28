package com.sanroman.vera.hectorubaldo.searchrecipes.data.model;

import java.util.List;

public class Hits {

    private String q;
    private int to, from, count;
    //private String [] params;
    private boolean more;
    private List<Hit> hits;

    public Hits() {

    }

    public Hits(String q, int to, int from, int count, boolean more, List<Hit> hits) {
        this.q = q;
        this.to = to;
        this.from = from;
        this.count = count;
        //this.params = params;
        this.more = more;
        this.hits = hits;
    }


    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public List<Hit> getHits() {
        return hits;
    }

    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }
}
