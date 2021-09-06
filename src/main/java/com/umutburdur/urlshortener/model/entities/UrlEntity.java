package com.umutburdur.urlshortener.model.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity(name = "Url")
@Getter
@Setter
@NoArgsConstructor
@Table(name = "URL")
public class UrlEntity extends BaseEntity {

    @Column (name = "ORIGINAL_URL", unique = true , length = 255 , nullable = false)
    private String originalUrl;

    @Column (name = "SHORT_URL", unique = true , length = 255 , nullable = false)
    private String shortUrl;

}
