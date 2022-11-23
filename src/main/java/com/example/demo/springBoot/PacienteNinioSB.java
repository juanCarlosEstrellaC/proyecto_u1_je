package com.example.demo.springBoot;

import org.springframework.stereotype.Component;

@Component
public class PacienteNinioSB extends PacienteSB {
	
	private int pesoNacimiento;
	
	public Integer calcularDescuento() {
		System.out.println("Paciente niño con el 10% de descuento");
		return 10;
	}
	
	public int getPesoNacimiento() {
		return pesoNacimiento;
	}
	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}
	
}
