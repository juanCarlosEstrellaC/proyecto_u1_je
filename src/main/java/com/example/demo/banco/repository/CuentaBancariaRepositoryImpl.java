package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	private static List<CuentaBancaria> baseCuentas = new ArrayList<>();
	
	
	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {
		// SELECT * FROM CUENTA C WHERE C.NUMERO = numeroCuenta
//		CuentaBancaria cuenta = new CuentaBancaria();
//		cuenta.setNumero(numeroCuenta);
//		cuenta.setSaldo(new BigDecimal(100));
//		cuenta.setTipo("A");
//		cuenta.setTitular("Edison Cayambe");
//		
		CuentaBancaria cuenta = null;

		for(CuentaBancaria cb: baseCuentas ) {
			if(cb.getNumero().equals(numeroCuenta)) {
				cuenta = cb;
			}
		}
			
		return cuenta;
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
			System.out.println("se busca la cuenta "+id);
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		System.out.println("se actualiza la cuenta "+cuentaBancaria);
		
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		System.out.println("se inserta la cuenta bancaria"+ cuentaBancaria);
		baseCuentas.add(cuentaBancaria);
	}

	@Override
	public void borrar(Integer id) {
		System.out.println("se borra la cuenta "+id);
		
	}

}
