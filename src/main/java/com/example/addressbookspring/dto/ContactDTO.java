package com.example.addressbookspring.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public @Data
class ContactDTO {
    @NotEmpty(message = "Name Cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Invalid Name")
    private String name;
    @NotEmpty(message = "City Cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Invalid City Name")
    private String city;
    @NotEmpty(message = "State Cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Invalid State Name")
    private String state;

    public ContactDTO(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
    }
}
