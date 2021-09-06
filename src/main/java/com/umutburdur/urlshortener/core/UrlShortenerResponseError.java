package com.umutburdur.urlshortener.core;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UrlShortenerResponseError {

    private String code;
    private String message;
}
