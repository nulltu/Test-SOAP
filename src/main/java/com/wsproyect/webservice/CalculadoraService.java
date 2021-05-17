package com.wsproyect.webservice;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws-proyect/calculadora")
public interface CalculadoraService {

	public double sumar(double num1, double num2);
	
}
