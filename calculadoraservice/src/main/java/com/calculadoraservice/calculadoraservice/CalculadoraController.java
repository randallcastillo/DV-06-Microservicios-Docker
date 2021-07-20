package com.calculadoraservice.calculadoraservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CalculadoraController {
    
    @GetMapping("/suma/{numero1}/{numero2}")
    @ResponseBody
	public Integer suma(@PathVariable Integer numero1, @PathVariable Integer numero2) {
        return new Calculadora(numero1, numero2).suma();
	}

    @GetMapping("/resta/{numero1}/{numero2}")
    @ResponseBody
	public Integer resta(@PathVariable Integer numero1, @PathVariable Integer numero2) {
        return new Calculadora(numero1, numero2).resta();
	}

}
