package com.example.demo.medica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.medica.modelo.Medico;
import com.example.demo.medica.repository.IMedicoRepository;

@Service
public class MedicoServiceImpl implements IMedicoService {

	@Autowired
	private IMedicoRepository iMedicoRepository;
	
	
	@Override
	public Medico buscar(String cedula) {
		return this.iMedicoRepository.buscar(cedula);
	}

	@Override
	public void crear(Medico medico) {
		this.iMedicoRepository.insertar(medico);
	}

	@Override
	public void modificar(Medico medico) {
		this.iMedicoRepository.actualizar(medico);
	}

	@Override
	public void quitar(String cedula) {
		this.iMedicoRepository.borrar(cedula);
	}


}
