package com.example.addressbookspring.service;

import com.example.addressbookspring.dto.ContactDTO;
import com.example.addressbookspring.model.ContactData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    private List<ContactData> contactDataList = new ArrayList<>();

    @Override
    public List<ContactData> getContactData(){
        return contactDataList;
    }

    @Override
    public ContactData getContactDataById(int contactId){
        return contactDataList.get(contactId - 1);
    }

    @Override
    public ContactData createContact(ContactDTO contactDTO){
        ContactData contactData = new ContactData(1, contactDTO);
        this.contactDataList.add(contactData);
        return contactData;
    }

    @Override
    public ContactData updateContact(int contactId, ContactDTO contactDTO){
        ContactData contactData = this.getContactDataById(contactId);
        contactData.setName(contactDTO.getName());
        contactData.setCity(contactDTO.getCity());
        contactData.setState(contactDTO.getState());
        contactDataList.set(contactId - 1, contactData);
        return contactData;
    }

    @Override
    public void deleteContact(int contactId){
        contactDataList.remove(contactId - 1);
    }
}
