package com.umutburdur.urlshortener.service;

import com.umutburdur.urlshortener.core.UrlShortenerResponseHolder;
import com.umutburdur.urlshortener.model.dto.BaseIDDTO;

import java.util.Collection;

public interface UrlShortenerCRUDBaseService <T extends BaseIDDTO> {

    UrlShortenerResponseHolder<Collection<T>> list();

    UrlShortenerResponseHolder<T> create(T data);

    UrlShortenerResponseHolder<?> delete(Long data);
}
