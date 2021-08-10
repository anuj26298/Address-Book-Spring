package com.example.addressbookspring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class AddressBookSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(AddressBookSpringApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(AddressBookSpringApplication.class, args);
        log.info("Address Book App Started in {} Environment",context.getEnvironment().getProperty("environment"));
        log.info("Address Book DB user is {} ",context.getEnvironment().getProperty("spring.datasource.username"));
    }

}
