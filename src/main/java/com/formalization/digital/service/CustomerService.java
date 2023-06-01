package com.formalization.digital.service;

import com.formalization.digital.model.CreateCustomerResponse;
import com.formalization.digital.model.CustomerRequest;
import com.formalization.digital.model.CustomerResponse;
import com.formalization.digital.model.FormalizationDigitalRequest;
import com.formalization.digital.repository.Entity.CustomerEntity;

import java.util.List;

public interface CustomerService {

    CustomerResponse createCustomer(CustomerRequest customerRequest, CreateCustomerResponse c);

    CreateCustomerResponse simulationProduct(Long id, CreateCustomerResponse c);

    List<CustomerEntity> findAllCustomers();

    CreateCustomerResponse formalizationDigital(FormalizationDigitalRequest formalizationDigitalRequest, CreateCustomerResponse c);
}
