package com.example.demo.medica.service;

import com.example.demo.medica.modelo.Medico;

public interface IMedicoService {

	public Medico buscar(String cedula);
	public void crear(Medico medico);
	public void modificar(Medico medico);
	public void quitar(String placa);
	
	
	
}
