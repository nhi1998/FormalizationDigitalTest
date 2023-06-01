package com.formalization.digital.controller;

import com.formalization.digital.model.CreateCustomerResponse;
import com.formalization.digital.model.CustomerRequest;
import com.formalization.digital.model.FormalizationDigitalRequest;
import com.formalization.digital.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class DigitalFormalizationController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/create/customer")
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCustomerResponse createCustomer(@RequestBody @Valid CustomerRequest customerRequest, CreateCustomerResponse c) {
        customerService.createCustomer(customerRequest, c);
        return c;
    }

    @GetMapping(value = "/simulation/customer/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CreateCustomerResponse simulationProduct(@PathVariable Long id, CreateCustomerResponse c) {
        customerService.simulationProduct(id, c);
        return c;

    }

    @PostMapping(value = "/formalization")
    @ResponseStatus(HttpStatus.OK)
    public CreateCustomerResponse formalization(@RequestBody @Valid FormalizationDigitalRequest formalizationDigitalRequest, CreateCustomerResponse c) {
        customerService.formalizationDigital(formalizationDigitalRequest, c);
        return c;
    }

}
