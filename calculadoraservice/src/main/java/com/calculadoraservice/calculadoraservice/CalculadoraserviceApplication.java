package com.calculadoraservice.calculadoraservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CalculadoraserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraserviceApplication.class, args);
	}
}
