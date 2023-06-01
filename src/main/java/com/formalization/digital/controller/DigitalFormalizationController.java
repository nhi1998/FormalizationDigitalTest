package com.formalization.digital.controller;

import com.formalization.digital.model.CreateCustomerResponse;
import com.formalization.digital.model.CustomerRequest;
import com.formalization.digital.model.CustomerResponse;
import com.formalization.digital.model.FormalizationDigitalRequest;
import com.formalization.digital.repository.Entity.CustomerEntity;
import com.formalization.digital.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DigitalFormalizationController {

    @Autowired
    private CustomerService customerService;

    /**
     * <p><b>NOTE:</b>
     *Este endpoint tem a responsabilidade de cadastrar um usuário e suas informações na base de dados
     * @author Natanael Inocencio
     */
    @PostMapping(value = "/create/customer")
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCustomerResponse createCustomer(@RequestBody @Valid CustomerRequest customerRequest, CreateCustomerResponse c) {
        customerService.createCustomer(customerRequest, c);
        return c;
    }

    /**
     * <p><b>NOTE:</b>
     *Este endpoint tem a responsabilidade formalizar o a proposta do cliente
     * @author Natanael Inocencio
     */
    @PostMapping(value = "/formalization")
    @ResponseStatus(HttpStatus.OK)
    public CreateCustomerResponse formalization(@RequestBody @Valid FormalizationDigitalRequest formalizationDigitalRequest, CreateCustomerResponse c) {
        customerService.formalizationDigital(formalizationDigitalRequest, c);
        return c;
    }

    /**
     * <p><b>NOTE:</b>
     *Este endpoint tem a responsabilidade de analisar o produto do usuário e simular o quanto ele teria de crédito
     * @author Natanael Inocencio
     */
    @GetMapping(value = "/simulation/customer/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CreateCustomerResponse simulationProduct(@PathVariable Long id, CreateCustomerResponse c) {
        customerService.simulationProduct(id, c);
        return c;

    }

    /**
     * <p><b>NOTE:</b>
     *Este endpoint tem a responsabilidade de buscar todos os clientes cadastrados na base
     *
     * @author Natanael Inocencio
     */
    @GetMapping(value = "/simulation/customers")
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerEntity> findAll() {
        return customerService.findAllCustomers();
    }



}
