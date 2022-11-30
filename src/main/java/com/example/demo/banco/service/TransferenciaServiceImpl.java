package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Override
	public List<Transferencia> buscarReporte() {
		
		return this.iTransferenciaRepository.buscarTodo();
	}

	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		//ORIGEN:
		//1. Buscar la cuenta origen
		CuentaBancaria origen = this.bancariaService.buscarPorNumero(numeroOrigen);
		
		//2. Consultar el saldo de la cuenta origen:
		BigDecimal saldoOrigen = origen.getSaldo();
		
		//3. Operación resta en el origen
		// nuevoMonto = saldoOrigen - monto
		BigDecimal nuevoSaldo = saldoOrigen.subtract(monto);
		
		//4. Actualización en el origen
		origen.setSaldo(nuevoSaldo);
		this.bancariaService.actualizar(origen);
		
		
		
		//DESTINO:
		//1. Buscar la cuenta destino
		CuentaBancaria destino = this.bancariaService.buscarPorNumero(numeroDestino);

		//2. Consultar el saldo de la cuenta destino
		BigDecimal saldoDestino = origen.getSaldo();

		//3. Operación resta en el destino
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);

		//4. Actualización en el destino
		destino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(destino);
	}

}