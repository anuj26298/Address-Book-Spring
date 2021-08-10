package com.example.addressbookspring.controller;

import com.example.addressbookspring.dto.ContactDTO;
import com.example.addressbookspring.dto.ResponseDTO;
import com.example.addressbookspring.model.ContactData;
import com.example.addressbookspring.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @GetMapping(value = {"","/"})
    public ResponseEntity<ResponseDTO> getAddressBook(){
        List<ContactData> contactDataList = addressBookService.getContactData();
        ResponseDTO responseDTO = new ResponseDTO("GET Address Book Successfully", contactDataList);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookById(@PathVariable int id){
        ContactData contactData = addressBookService.getContactDataById(id);
        ResponseDTO responseDTO = new ResponseDTO("GET by Id: " + id + " Successful", contactData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDTO> addContactToAddressBook( @Valid @RequestBody ContactDTO contactDTO){
        ContactData contactData = addressBookService.createContact(contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Contact Added Successfully: ", contactData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateContact(@Valid @RequestBody ContactDTO contactDTO, @PathVariable int id){
        ContactData contactData = addressBookService.updateContact(id,contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Contact Updated Successfully: ", contactData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteContact(@PathVariable int id){
        addressBookService.deleteContact(id);
        ResponseDTO responseDTO = new ResponseDTO("Contact with id: " + id + " deleted", +id);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
}
