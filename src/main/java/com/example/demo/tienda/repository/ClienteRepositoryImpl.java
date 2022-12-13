package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.tienda.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

	private static List<Cliente> baseDatos = new ArrayList<>();
 	
	@Override
	public void insertar(Cliente cliente) {
		baseDatos.add(cliente);//__________________
	}

	@Override
	public void actualizar(Cliente cliente) {
		Cliente cli = null;

		for(Cliente c: baseDatos) {  						  // Para cada elemento en baseCuentas, hacer:
			if(c.getCedula().equals(cliente.getCedula())) {   // Si ese elemento es igual al número de cuenta pasado, cuenta se inicializa con el elemento.
				//baseCuentas.add(cuentaBancaria);
				cli = c;
			}
		}	
		baseDatos.remove(cli);
		baseDatos.add(cliente);
	}

	@Override
	public Cliente buscar(String cedula) {
		Cliente cli = null;

		for(Cliente c: baseDatos) {  						  // Para cada elemento en baseCuentas, hacer:
			if(c.getCedula().equals(cedula)){   // Si ese elemento es igual al número de cuenta pasado, cuenta se inicializa con el elemento.
				//baseCuentas.add(cuentaBancaria);
				cli = c;
			}
		}	
		return cli;
	}

	@Override
	public void eliminar(String cedula) {
		Cliente cli = buscar(cedula);
		baseDatos.remove(cedula);
	}

}
