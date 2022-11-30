package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	private static List<Transferencia> baseDatos = new ArrayList<>();
	
	@Override
	public Transferencia buscar(Integer id) {

		return null;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		
	}

	@Override
	public void insertar(Transferencia transferencia) {
		baseDatos.add(transferencia);
	}

	@Override
	public void borrar(Integer id) {
		
	}

	@Override
	public List<Transferencia> buscarTodo() {
		// TODO Auto-generated method stub
		return null;
	}

}
