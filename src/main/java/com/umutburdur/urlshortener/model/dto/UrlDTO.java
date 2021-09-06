package com.umutburdur.urlshortener.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UrlDTO extends BaseIDDTO {
    private String originalUrl;
    private String shortUrl;
}
