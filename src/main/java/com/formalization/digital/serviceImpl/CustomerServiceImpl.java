package com.formalization.digital.serviceImpl;

import com.formalization.digital.model.CreateCustomerResponse;
import com.formalization.digital.model.CustomerRequest;
import com.formalization.digital.model.CustomerResponse;
import com.formalization.digital.model.FormalizationDigitalRequest;
import com.formalization.digital.repository.CustomerRepository;
import com.formalization.digital.repository.Entity.CustomerEntity;
import com.formalization.digital.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public CustomerResponse createCustomer(CustomerRequest customerRequest, CreateCustomerResponse c) {

        CustomerEntity ce = new CustomerEntity();
        try {


            ce.setCustomerName(customerRequest.getCustomerName());
            ce.setAddress(customerRequest.getAddress());
            ce.setRg(customerRequest.getRg());
            ce.setCpf(customerRequest.getCpf());
            ce.setEmail(customerRequest.getEmail());
            ce.setGenere(customerRequest.getGenere());
            ce.setTelephone(customerRequest.getTelephone());
            ce.setStateCivil(customerRequest.getStateCivil());
            ce.setProduct(customerRequest.getProduct());

            CustomerEntity save = customerRepository.save(ce);

            c.setMessage("Dados do cliente inserido com sucesso");


            CustomerResponse customerResponse = extracted(save);

            return customerResponse;

        } catch (Exception e) {
            System.out.println("Favor revisar os campos inseridos");
        }
        return null;
    }

    @Override
    public CreateCustomerResponse simulationProduct(Long id, CreateCustomerResponse c) {
        String Bronze = "Bronze";
        String Silver = "Prata";
        String Gold = "Ouro";

        CustomerEntity ce = new CustomerEntity();
        CustomerRequest customerRequest = new CustomerRequest();

        List<CustomerEntity> returnStub = customerRepository.findAllById(Collections.singleton(id));

        System.out.println(returnStub);

        if(Objects.equals(returnStub.get(0).getProduct(), Bronze)){
            customerRequest.setLimitCredit(1000.00F);
            ce.setLimitCredit(customerRequest.getLimitCredit());
            c.setMessage("Realizamos uma simulção interna e o seu cartão Bronze ira possuir um limite de 1000.00, Deseja seguir com a formalização da contratação?");
        } else if (Objects.equals(returnStub.get(0).getProduct(), Silver)) {
            customerRequest.setLimitCredit(2000.00F);
            ce.setLimitCredit(customerRequest.getLimitCredit());
            c.setMessage("Realizamos uma simulção interna e o seu cartão Prata ira possuir um limite de 2000.00, Deseja seguir com a formalização da contratação?");
        } else if (Objects.equals(returnStub.get(0).getProduct(), Gold)) {
            customerRequest.setLimitCredit(3000.00F);
            ce.setLimitCredit(customerRequest.getLimitCredit());
            c.setMessage("Realizamos uma simulção interna e o seu cartão Ouro ira possuir um limite de 3000.00, Deseja seguir com a formalização da contratação?");
        }

        return c;
    }

    @Override
    public CreateCustomerResponse formalizationDigital(FormalizationDigitalRequest formalizationDigitalRequest, CreateCustomerResponse c) {
        CustomerEntity ce = new CustomerEntity();

        List<CustomerEntity> returnInfoByCustomer = customerRepository.findAllById(Collections.singleton(formalizationDigitalRequest.getIdCustomer()));

        returnInfoByCustomer.stream().forEach( t -> {
            t.setSignature(formalizationDigitalRequest.getSignature());
            t.setContractFormalization(formalizationDigitalRequest.getContractFormalization());
        });

        System.out.println(returnInfoByCustomer);

        customerRepository.saveAll(returnInfoByCustomer);

        c.setMessage("Contratação formalizada com sucesso");

        return c;
    }

    private CustomerResponse extracted(CustomerEntity save) {
        CustomerResponse cr = new CustomerResponse();
    
        cr.setCustomerName(save.getCustomerName());
        cr.setAddress(save.getAddress());
        cr.setRg(save.getRg());
        cr.setCpf(save.getCpf());
        cr.setEmail(save.getEmail());
        cr.setGenere(save.getGenere());
        cr.setStateCivil(save.getStateCivil());
        cr.setTelephone(save.getTelephone());
        cr.setProduct(save.getProduct());
        return cr;
    }
}
