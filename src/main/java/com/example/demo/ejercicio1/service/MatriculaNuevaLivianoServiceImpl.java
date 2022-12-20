package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;

@Service("liviano")
public class MatriculaNuevaLivianoServiceImpl implements IMatriculaNuevaService{

	@Override
	public void matricular(String cedula, String placa) {
		System.out.println("Matriculado Liviano");
		System.out.println("Calculo del descuento de 2000.");
	}

}
