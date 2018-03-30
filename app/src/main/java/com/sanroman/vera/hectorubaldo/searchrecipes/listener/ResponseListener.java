package com.sanroman.vera.hectorubaldo.searchrecipes.listener;

import com.sanroman.vera.hectorubaldo.searchrecipes.data.model.Hits;

public interface ResponseListener {

    void sendHitsInformation(Hits hits);
}
