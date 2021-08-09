package com.example.addressbookspring.dto;

public class ContactDTO {

    private String name;
    private String city;
    private String state;

    public ContactDTO(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ContactDTO{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
