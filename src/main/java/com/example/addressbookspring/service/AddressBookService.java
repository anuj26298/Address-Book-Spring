package com.example.addressbookspring.service;

import com.example.addressbookspring.dto.ContactDTO;
import com.example.addressbookspring.model.ContactData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    @Override
    public List<ContactData> getContactData(){
        List<ContactData> contactDataList = new ArrayList<>();
        contactDataList.add(new ContactData(1, new ContactDTO("Anuj","Mrt","UP")));
        return contactDataList;
    }

    @Override
    public ContactData getContactDataById(int contactId){
        ContactData contactData = new ContactData(contactId, new ContactDTO("Abhi","Mzff","UP"));
        return contactData;
    }

    @Override
    public ContactData createContact(ContactDTO contactDTO){
        ContactData contactData = new ContactData(1, contactDTO);
        return contactData;
    }

    @Override
    public ContactData updateContact(int contactId, ContactDTO contactDTO){
        ContactData contactData = new ContactData(contactId, contactDTO);
        return contactData;
    }

    @Override
    public ContactData deleteContact(int contactId){
        ContactData contactData = new ContactData(contactId, new ContactDTO("Anuj","Mrt", "UP" ));
        return contactData;
    }
}
