package com.example.addressbookspring.model;

import com.example.addressbookspring.dto.ContactDTO;

public class ContactData {
    private int contactId;
    private String name;
    private String city;
    private String state;

    public ContactData(){
    }

    public ContactData(int contactId, ContactDTO contactDTO){
        this.contactId = contactId;
        this.name = contactDTO.getName();
        this.city = contactDTO.getCity();
        this.state = contactDTO.getState();
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
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
}
