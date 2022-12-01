package com.example.demo.banco.service;
import java.math.BigDecimal;
import java.util.List;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaService { 	//deber: construir CRUD
	
	public List<Transferencia> buscarReporte();
	
	// MIO:
	public List<Transferencia> buscarReporte(String numeroCuenta);

	// Pienso que solo aquí debe estar el método realizar, ya que en el Service se hace la Lógica.
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto);  // realizar Transferencia
	
	//Deber:
	//C R U D sin implementar:
	public Transferencia buscar(Integer id);
	public void actualizar(Transferencia transferencia);
	public void insertar(Transferencia transferencia);
	public void borrar(Integer id);
	
}
