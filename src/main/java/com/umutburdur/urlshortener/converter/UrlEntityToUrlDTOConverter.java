package com.umutburdur.urlshortener.converter;

import com.umutburdur.urlshortener.model.dto.UrlDTO;
import com.umutburdur.urlshortener.model.entities.UrlEntity;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Component
public class UrlEntityToUrlDTOConverter implements Converter<UrlEntity, UrlDTO> {
    @Override
    public UrlDTO convert(UrlEntity input) {
        UrlDTO urlDTO = new UrlDTO();
        urlDTO.setId(input.getId());
        urlDTO.setCreatedAt(Objects.isNull(input.getCreatedAt()) ? new Date() : input.getCreatedAt());
        urlDTO.setOriginalUrl(input.getOriginalUrl());
        urlDTO.setShortUrl(input.getShortUrl());
        return urlDTO;
    }
}
