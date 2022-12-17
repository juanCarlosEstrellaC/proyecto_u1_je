package com.example.demo.medica.repository;

import com.example.demo.medica.modelo.Medico;

public interface IMedicoRepository {

	public Medico buscar(String id);
	public void borrar(String id);
	public void insertar(Medico medico);
	public void actualizar(Medico medico);
	
}
