package com.prueba.digitalspace.infrastructure.rest.controller;

import com.prueba.digitalspace.application.usecase.CustomerService;
import com.prueba.digitalspace.domain.model.dto.request.RequestCustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CustomerController {
    private final CustomerService customerService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public Object createCustomer(@RequestBody RequestCustomerDto requestCustomerDto){
        return customerService.createCustomer(requestCustomerDto);
    }
}
