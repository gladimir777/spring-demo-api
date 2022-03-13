package com.example.demo.user;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "USER_PHONE")
public class Phone {
    @Id
    @GeneratedValue
    private Long id;
    private String number;
    private String cityCode;
    private String countryCode;

    public Phone() {
    }

    public Phone(Long id,
                 String number,
                 String cityCode,
                 String countryCode) {
        this.id = id;
        this.number = number;
        this.cityCode = cityCode;
        this.countryCode = countryCode;
    }

    public Phone(String number,
                 String cityCode,
                 String countryCode) {
        this.number = number;
        this.cityCode = cityCode;
        this.countryCode = countryCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
