package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepository bancariaRepository; //bypass
	
	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {
		return this.bancariaRepository.buscarPorNumero(numeroCuenta);
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		return this.bancariaRepository.buscar(id);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		this.bancariaRepository.actualizar(cuentaBancaria);
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		this.bancariaRepository.insertar(cuentaBancaria);
	}

	@Override
	public void borrar(Integer id) {
		this.bancariaRepository.borrar(id);
	}

}
