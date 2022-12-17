package com.example.demo.medica.repository;

import com.example.demo.medica.modelo.Paciente;

public interface IPacienteRepository {
	
	public void insertar(Paciente propietario);
	public void eliminar(String cedula);
	public Paciente buscar(String cedula);
	
}
