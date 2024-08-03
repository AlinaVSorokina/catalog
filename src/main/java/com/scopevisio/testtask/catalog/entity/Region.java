package com.scopevisio.testtask.catalog.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Region {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String ISO_3166_1_ALPHA_2;
    private String ISO_3166_1_ALPHA_2_region_code;
    private String REGION1;
    private String REGION2;
    private String REGION3;
    private String REGION4;
    private String postcode;
    private String ORT;
    private String AREA1;
    private String AREA2;
    private String LATITUDE;
    private String LONGITUDE;
    private String TIMEZONE;
    private String UTC;
    private String SUMMERTIME;
    private String ACTIVE;
}
