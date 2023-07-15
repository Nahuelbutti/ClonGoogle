package com.clonProyect.clon.repositories;

import com.clonProyect.clon.entities.WebPage;

import java.util.List;

public interface SearchRepository {

    WebPage getByUrl(String url);

    List<WebPage> getLinksToIndex();

    List<WebPage> search(String textSearch);

    void save(WebPage webPage);

    boolean exist(String link);
}
