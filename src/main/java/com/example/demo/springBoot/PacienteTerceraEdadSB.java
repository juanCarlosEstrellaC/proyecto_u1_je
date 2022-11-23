package com.example.demo.springBoot;

import org.springframework.stereotype.Component;

@Component // con esta anotación le digo a Spring que haga new a esta clase
public class PacienteTerceraEdadSB extends PacienteSB {
	
	private String codigoIESS;

	public Integer calcularDescuento() {
		System.out.println("Paciente tercera edad del 20%");
		return 20;
	}
	
	public String getCodigoIESS() {
		return codigoIESS;
	}
	public void setCodigoIESS(String codigoIESS) {
		this.codigoIESS = codigoIESS;
	}
	 
}
