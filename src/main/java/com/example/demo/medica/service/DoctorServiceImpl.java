package com.example.demo.medica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.medica.modelo.Doctor;
import com.example.demo.medica.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepository iMedicoRepository;
	
	
	@Override
	public Doctor buscar(String cedula) {
		return this.iMedicoRepository.buscar(cedula);
	}

	@Override
	public void crear(Doctor medico) {
		this.iMedicoRepository.insertar(medico);
	}

	@Override
	public void modificar(Doctor medico) {
		this.iMedicoRepository.actualizar(medico);
	}

	@Override
	public void quitar(String cedula) {
		this.iMedicoRepository.borrar(cedula);
	}


}
