package com.example.demo.medica.repository;

import com.example.demo.medica.modelo.Doctor;

public interface IDoctorRepository {

	public Doctor buscar(String id);
	public void borrar(String id);
	public void insertar(Doctor doctor);
	public void actualizar(Doctor doctor);
	
}
