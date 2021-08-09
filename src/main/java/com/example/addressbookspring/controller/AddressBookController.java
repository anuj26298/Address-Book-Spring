package com.example.addressbookspring.controller;

import com.example.addressbookspring.dto.ContactDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @GetMapping(value = {"","/"})
    public String getAddressBook(){
        return "GET: Get Address Book Successfully";
    }

    @GetMapping(value = "/get/{id}")
    public String getAddressBookById(@PathVariable int id){
        return "GET by Id:" + id + ", Successfully";
    }

    @PostMapping("/add")
    public String addContactToAddressBook(@RequestBody ContactDTO contactDTO){
        return "Contact Added Successfully: " + contactDTO;
    }

    @PutMapping("/update")
    public String updateContact(@RequestBody ContactDTO contactDTO){
        return "Contact Updated Successfully: " + contactDTO;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteContact(@PathVariable int id){
        return "Contact with Id: " + id +"Deleted Successfully";
    }
}
