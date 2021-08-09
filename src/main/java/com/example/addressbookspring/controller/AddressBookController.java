package com.example.addressbookspring.controller;

import com.example.addressbookspring.dto.ContactDTO;
import com.example.addressbookspring.dto.ResponseDTO;
import com.example.addressbookspring.model.ContactData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @GetMapping(value = {"","/"})
    public ResponseEntity<ResponseDTO> getAddressBook(){
        ContactData contactData = new ContactData(1,
                new ContactDTO("Anuj","Mrt", "UP"));
        ResponseDTO responseDTO = new ResponseDTO("GET Address Book Successfully", contactData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookById(@PathVariable int id){
        ContactData contactData = new ContactData(1,
                new ContactDTO("Anuj","Mrt","UP"));
        ResponseDTO responseDTO = new ResponseDTO("GET by Id: " + id + " Successful", contactData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ResponseDTO> addContactToAddressBook(@RequestBody ContactDTO contactDTO){
        ContactData contactData = new ContactData(1,contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Contact Added Successfully: ", contactData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateContact(@RequestBody ContactDTO contactDTO){
        ContactData contactData = new ContactData(1,contactDTO);
        ResponseDTO responseDTO = new ResponseDTO("Contact Updated Successfully: ", contactData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteContact(@PathVariable int id){
        ResponseDTO responseDTO = new ResponseDTO("Contact with id: " + id + " deleted", +id);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
}
