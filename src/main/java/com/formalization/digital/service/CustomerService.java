package com.formalization.digital.service;

import com.formalization.digital.model.CreateCustomerResponse;
import com.formalization.digital.model.CustomerRequest;
import com.formalization.digital.model.CustomerResponse;
import com.formalization.digital.model.FormalizationDigitalRequest;

public interface CustomerService {

    CustomerResponse createCustomer(CustomerRequest customerRequest, CreateCustomerResponse c);

    CreateCustomerResponse simulationProduct(Long id, CreateCustomerResponse c);

    CreateCustomerResponse formalizationDigital(FormalizationDigitalRequest formalizationDigitalRequest, CreateCustomerResponse c);
}
