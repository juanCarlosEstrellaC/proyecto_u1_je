package com.example.demo.banco.service;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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

	//MIO:
//	@Override
//	public List<Transferencia> buscarReporte(String numeroCuenta) {
//		return this.iTransferenciaRepository.buscarTodo(numeroCuenta);
//	}
	
	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// Pasos para realizar la Transferencia:
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
			
			//Insertar la transferencia:
			Transferencia trans = new Transferencia();
			trans.setCuentaDestino(numeroDestino);
			trans.setCuentaOrigen(numeroOrigen);
			trans.setFecha(LocalDateTime.now());
			trans.setMonto(monto);
			trans.setNumero("12345");
			
			this.iTransferenciaRepository.insertar(trans);
	}

	
	
	//Deber:
	//C R U D implementado:
	@Override
	public Transferencia buscar(Integer id) {
		return this.iTransferenciaRepository.buscar(id) ;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.iTransferenciaRepository.actualizar(transferencia);
	}

	@Override
	public void insertar(Transferencia transferencia) {
		this.iTransferenciaRepository.insertar(transferencia);
	}

	@Override
	public void borrar(Integer id) {
		this.iTransferenciaRepository.borrar(id);
	}

	@Override
	public List<Transferencia> buscarReporte(String numeroCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
