package com.wsproyect.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.wsproyect.webservice.CalculadoraService", name = "")
public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public double sumar(double num1, double num2) {
		return num1+num2;
	}

}
