package com.sanroman.vera.hectorubaldo.searchrecipes.data.model;

public class Hits {

    private String q;
    private int to, from, count;
    private String [][] params;
    private boolean more;
    private Hit[] hits;

    public Hits() {

    }

    public Hits(String q, int to, int from, int count, String[][] params, boolean more, Hit[] hits) {
        this.q = q;
        this.to = to;
        this.from = from;
        this.count = count;
        this.params = params;
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

    public String[][] getParams() {
        return params;
    }

    public void setParams(String[][] params) {
        this.params = params;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public Hit[] getHits() {
        return hits;
    }

    public void setHits(Hit[] hits) {
        this.hits = hits;
    }
}
