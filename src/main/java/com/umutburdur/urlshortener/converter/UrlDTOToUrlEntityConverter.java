package com.umutburdur.urlshortener.converter;

import com.umutburdur.urlshortener.model.dto.UrlDTO;
import com.umutburdur.urlshortener.model.entities.UrlEntity;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Component
public class UrlDTOToUrlEntityConverter implements Converter<UrlDTO, UrlEntity> {
    @Override
    public UrlEntity convert(UrlDTO input) {
        UrlEntity urlEntity = new UrlEntity();
        urlEntity.setId(input.getId());
        urlEntity.setCreatedAt(Objects.isNull(input.getCreatedAt()) ? new Date() : input.getCreatedAt());
        urlEntity.setOriginalUrl(input.getOriginalUrl());
        urlEntity.setShortUrl(input.getShortUrl());
        return urlEntity;
    }
}
