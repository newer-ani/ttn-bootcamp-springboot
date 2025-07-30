package com.ttn.Spring_Boot.Assingments.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class Address {

    private Long streetNumber;
    private String location;
    private String state;

    public Long getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Long streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
