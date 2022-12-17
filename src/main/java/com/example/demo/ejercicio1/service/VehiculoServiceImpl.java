package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	
	@Override
	public Vehiculo buscar(String placa) {
		return this.iVehiculoRepository.buscar(placa);
	}

	@Override
	public void crear(Vehiculo vehiculo) {
		this.iVehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void modificar(Vehiculo vehiculo) {
		this.iVehiculoRepository.actualizar(vehiculo);
	}

	@Override
	public void quitar(String placa) {
		this.iVehiculoRepository.borrar(placa);
	}

	@Override
	public void modificar(String placa, BigDecimal precio, String marca) {
		Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
		vehiculo.setMarca(marca);
		vehiculo.setPrecio(precio);
		
		this.iVehiculoRepository.actualizar(vehiculo);
	}

}
