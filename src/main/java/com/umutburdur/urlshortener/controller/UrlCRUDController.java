package com.umutburdur.urlshortener.controller;

import com.umutburdur.urlshortener.config.SwaggerClient;
import com.umutburdur.urlshortener.core.UrlShortenerResponseHolder;
import com.umutburdur.urlshortener.model.dto.UrlDTO;
import com.umutburdur.urlshortener.model.entities.UrlEntity;
import com.umutburdur.urlshortener.service.UrlCRUDService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.util.Collection;

@RestController
@RequiredArgsConstructor
@SwaggerClient
@RequestMapping("/url")
public class UrlCRUDController {
    private final UrlCRUDService urlCRUDService;

    @GetMapping
    public UrlShortenerResponseHolder<Collection<UrlDTO>> getOriginalUrls() {
        return urlCRUDService.list();
    }

    @PostMapping
    public UrlShortenerResponseHolder<UrlDTO> create(@RequestBody UrlDTO urlDTO) throws MalformedURLException {
        String createdPart = shuffledChars();
        createdUrl (createdPart , urlDTO);
        return urlCRUDService.create(urlDTO);
    }

    @DeleteMapping("/{id}")
    public UrlShortenerResponseHolder<?> delete(@PathVariable Long id) {
        return urlCRUDService.delete(id);
    }

    private String shuffledChars() {
        String randomStr = "";
        String possibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 6; i++)
            randomStr += possibleChars.charAt((int) Math.floor(Math.random() * possibleChars.length()));
        return randomStr;
    }

    private void createdUrl(String createdPart, UrlDTO urlDTO) throws MalformedURLException {
        urlDTO.setShortUrl("http://localhost:8080/s/"+createdPart); // This part will change after heroku deployment

    }
}
