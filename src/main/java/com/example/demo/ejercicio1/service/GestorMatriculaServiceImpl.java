package com.example.demo.ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService{

	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaNuevaService iMatriculaService;
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaNuevaService iMatriculaServiceLiviano;
	
	@Override
	public void matricular(String cedula, String placa) {
		Vehiculo vehi = null;
		if (vehi.getTipo().equals("P")) {
			this.iMatriculaService.matricular("184965486", "POI34564");
		}else {
			this.iMatriculaServiceLiviano.matricular("184965486", "POI34564");
		}
		
		//Programo descuento
	}

}
