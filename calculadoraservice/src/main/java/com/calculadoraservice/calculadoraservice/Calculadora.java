//package src.main.java.com.calculadoraservice.calculadoraservice;

package com.calculadoraservice.calculadoraservice;

public class Calculadora {

	private Integer numero1;
	private Integer numero2;

	public Calculadora(Integer numero1, Integer numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public Integer suma() {
		Integer result = numero1 + numero2;
		return result;
	}

	public Integer resta() {
		Integer result = numero1 - numero2;
		return result;
	}
}
