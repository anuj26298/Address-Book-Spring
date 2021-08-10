package com.example.addressbookspring.service;

import com.example.addressbookspring.dto.ContactDTO;
import com.example.addressbookspring.model.ContactData;

import java.util.List;

public interface IAddressBookService {
    List<ContactData> getContactData();

    ContactData getContactDataById(int contactId);

    ContactData createContact( ContactDTO contactDTO);

    ContactData updateContact(int contactId, ContactDTO contactDTO);

    void deleteContact(int contactId);
}
