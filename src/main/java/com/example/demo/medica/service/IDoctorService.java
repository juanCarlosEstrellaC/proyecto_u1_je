package com.example.demo.medica.service;

import com.example.demo.medica.modelo.Doctor;

public interface IDoctorService {

	public Doctor buscar(String cedula);
	public void crear(Doctor medico);
	public void modificar(Doctor medico);
	public void quitar(String placa);
	
	
	
}
