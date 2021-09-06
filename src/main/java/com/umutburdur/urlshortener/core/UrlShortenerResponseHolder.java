package com.umutburdur.urlshortener.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class UrlShortenerResponseHolder<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T responseData;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private HttpStatus httpStatus;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UrlShortenerResponseError error;

    public UrlShortenerResponseHolder(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public UrlShortenerResponseHolder(T responseData, HttpStatus httpStatus) {
        this.responseData = responseData;
        this.httpStatus = httpStatus;
    }

    public UrlShortenerResponseHolder(HttpStatus httpStatus,
                                      UrlShortenerResponseError error) {
        this.httpStatus = httpStatus;
        this.error = error;
    }

}
