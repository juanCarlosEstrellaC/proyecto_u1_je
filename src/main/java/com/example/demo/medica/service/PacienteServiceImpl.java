package com.example.demo.medica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.medica.modelo.Paciente;
import com.example.demo.medica.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	
	@Override
	public void guardar(Paciente paciente) {
		this.iPacienteRepository.insertar(paciente);
	}

	@Override
	public void eliminar(String cedula) {
		this.iPacienteRepository.eliminar(cedula);
	}

}
