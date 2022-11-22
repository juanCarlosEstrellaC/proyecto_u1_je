package com.example.demo.herencia;

public class PacienteCancerH extends PacienteH{

	public Integer calcularDescuento() {
		System.out.println("Paciente Cancer con el 10% de descuento");
		return 30;
	}
	
}
