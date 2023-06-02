package com.formalization.digital;

import com.formalization.digital.model.CreateCustomerResponse;
import com.formalization.digital.model.CustomerRequest;
import com.formalization.digital.model.FormalizationDigitalRequest;
import com.formalization.digital.repository.Entity.CustomerEntity;
import com.formalization.digital.serviceImpl.CustomerServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FormalizationDigitalApplicationTests {
	@Autowired
	private CustomerServiceImpl customerService;

	@Test
	void contextLoads() {
	}

	@Test
	public void shouldCreateCustomer() {
		CreateCustomerResponse c = new CreateCustomerResponse();
		c.setMessage("Teste insersão");
		CustomerRequest beans = saveEntities();

		customerService.createCustomer(beans, c);

	}


    @Test
	public void shouldFindAllCustomer() {
		CreateCustomerResponse c = new CreateCustomerResponse();
		List<CustomerEntity> list = customerService.findAllCustomers();
		for (CustomerEntity userBeans : list) {
			System.out.println(userBeans.toString());
			System.out.println("----------------------");
		}
	}


	@Test
	public void shouldReturnSimulation() {
		CustomerEntity dao = new CustomerEntity();
		CreateCustomerResponse c = new CreateCustomerResponse();
		Long id = 1L;
		CreateCustomerResponse user = customerService.simulationProduct(id, c);
		System.out.println("----> "+user.getMessage());
	}

	@Test
	public void shouldFormalizationContract() {
		CreateCustomerResponse c = new CreateCustomerResponse();

		FormalizationDigitalRequest formalizationDigitalRequest = mockFormalizationDigital();

		CreateCustomerResponse messageFormalization = customerService.formalizationDigital(formalizationDigitalRequest, c);

		System.out.println("----> "+messageFormalization.getMessage());
	}

	private static FormalizationDigitalRequest mockFormalizationDigital() {
		FormalizationDigitalRequest formalizationDigitalRequest = new FormalizationDigitalRequest();
		formalizationDigitalRequest.setContractFormalization("Contrato");
		formalizationDigitalRequest.setSignature("Assinado");
		formalizationDigitalRequest.setIdCustomer(1L);

		return formalizationDigitalRequest;
	}

	private static CustomerRequest saveEntities() {
		CustomerRequest beans = new CustomerRequest();

		String customerName = "Natanael";
		String address = "Rua Endereço";
		String rg = "000000";
		String cpf = "0000000";
		String telephone = "1100000";
		String email = "djsdjsjd@sjsajs";
		String genere = "masculino";
		String stateCivil = "casado";
		String product = "Bronze";

		beans.setCustomerName(customerName);
		beans.setCustomerName(address);
		beans.setCustomerName(rg);
		beans.setCustomerName(cpf);
		beans.setCustomerName(telephone);
		beans.setCustomerName(email);
		beans.setCustomerName(genere);
		beans.setCustomerName(stateCivil);
		beans.setCustomerName(product);
		return beans;
	}
}
