package com.example.addressbookspring.dto;

import lombok.Data;

public @Data
class ContactDTO {

    private String name;
    private String city;
    private String state;

    public ContactDTO(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
    }
}
