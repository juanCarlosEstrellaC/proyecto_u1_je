package com.example.demo.springBoot;

import org.springframework.stereotype.Component;

@Component
public class PacienteCancerSB extends PacienteSB{

	public Integer calcularDescuento() {
		System.out.println("Paciente Cancer con el 10% de descuento");
		return 30;
	}
	
}
