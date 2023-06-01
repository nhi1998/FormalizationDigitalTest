package com.formalization.digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class FormalizationDigitalApplication {


	public static void main(String[] args) {
		SpringApplication.run(FormalizationDigitalApplication.class, args);
	}

}
