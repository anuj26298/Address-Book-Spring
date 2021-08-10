package com.example.addressbookspring.exceptions;

import com.example.addressbookspring.dto.ResponseDTO;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class AddressBookExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handleException(MethodArgumentNotValidException exception){
        List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
        List<String> errorMessages = errorList.stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList());
        return new ResponseEntity<>(new ResponseDTO("Exceptions",errorMessages), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AddressBookExceptions.class)
    public ResponseEntity<ResponseDTO> handlePersonNotFound(AddressBookExceptions exceptions){
        return new ResponseEntity<>(new ResponseDTO("Exceptions", exceptions.getCause()),HttpStatus.BAD_REQUEST);
    }
}
