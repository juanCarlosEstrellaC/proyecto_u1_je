package com.example.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepository clienteRepository;
	
	@Override
	public void agregar(Cliente cliente) {   // colocar nombres más de negocio, en vez de insertar, sería agregar.
		this.clienteRepository.insertar(cliente);
	}

}
