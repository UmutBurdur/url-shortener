package com.umutburdur.urlshortener.service;

import com.umutburdur.urlshortener.core.UrlShortenerResponseHolder;
import com.umutburdur.urlshortener.model.dto.UrlDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Slf4j
public class UrlCRUDServiceImpl implements UrlCRUDService {

    @Override
    public UrlShortenerResponseHolder<Collection<UrlDTO>> list() {
        return null;
    }

    @Override
    public UrlShortenerResponseHolder<UrlDTO> create(UrlDTO data) {
        return null;
    }

    @Override
    public UrlShortenerResponseHolder<?> delete(Long data) {
        return null;
    }
}
