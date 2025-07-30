package com.ttn.Spring_Boot.Assingments.dtos;

import java.util.List;

public class AuthorDto {

    private String name;
    private List<String> subjects;
    private AddressDto address;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }


}
