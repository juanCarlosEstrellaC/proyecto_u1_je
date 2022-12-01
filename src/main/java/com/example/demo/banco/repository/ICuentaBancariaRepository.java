package com.example.demo.banco.repository;
import com.example.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {

	public CuentaBancaria buscarPorNumero(String numeroCuenta); // Método que devuelve una CuentaBancaria dado un número de cuenta.
	
	//C R U D sin implementar:
	public CuentaBancaria buscar(Integer id);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);
	
}
