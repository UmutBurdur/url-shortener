package com.umutburdur.urlshortener.converter;

public interface Converter <T, R>{
    R convert (T input);
}
