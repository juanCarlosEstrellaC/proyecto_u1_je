package com.example.demo.banco.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	private static List<Transferencia> baseDatos = new ArrayList<>();
	
	//Deber
	//C R U D implementado:
	@Override
	public Transferencia buscar(Integer id) {
		System.out.println("Se busca la transferencia "+id);
		return null;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		System.out.println("Se actualiza la cuenta "+transferencia);
	}

	@Override
	public void insertar(Transferencia transferencia) {
		System.out.println("Se inserta la transferencia "+ transferencia);
		baseDatos.add(transferencia);
	}

	@Override
	public void borrar(Integer id) {
		System.out.println("Se borra la transferencia "+id);
	}

	
	@Override
	public List<Transferencia> buscarTodo() {
		return baseDatos;
	}
	
	
	//MIo
	// Si se desea obtener todas las transferencias de una cuenta origen, dada un número de cuenta.
//	@Autowired
//	private ICuentaBancariaRepository bancariaRepository;
//	
//	public List<Transferencia> buscarTodo(String numeroCuenta) {
//		CuentaBancaria cuenta = bancariaRepository.buscarPorNumero(numeroCuenta);
//		List<Transferencia> transferList = new ArrayList<>();
//		if(baseDatos.size() == 0) {
//			System.out.println("No hay transferencias aún.");
//		}else{
//			for(Transferencia t: baseDatos) {  			
//				System.out.println("Las Transferencias son: ");
//				if(t.getCuentaOrigen().equals(cuenta.getTitular())) {       
//					System.out.println(t.getNumero());
//					transferList.add(t);
//				}else{
//					System.out.println("No hay transferencias hechas");
//				}
//			}
//		}
//		return transferList;
	//}

}
