package com.example.demo.tienda.repository;

import com.example.demo.tienda.modelo.Cliente;

public interface IClienteRepository {
	
	public void insertar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(String cedula);	//buscar por algún id
	public void eliminar(String cedula);	//eliminar por algún id
	
}
