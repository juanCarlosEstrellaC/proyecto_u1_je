package com.example.demo.medica.service;

import com.example.demo.medica.modelo.Paciente;

public interface IPacienteService {

	public void guardar(Paciente paciente);
	public void eliminar(String cedula);
	
}
