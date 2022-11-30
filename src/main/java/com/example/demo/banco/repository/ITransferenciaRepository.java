package com.example.demo.banco.repository;

import java.util.List;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public List<Transferencia> buscarTodo ();
	
	//CRUD
		public Transferencia buscar(Integer id);
		//
		public void actualizar(Transferencia transferencia);
		public void insertar(Transferencia transferencia);
		public void borrar(Integer id);

		
}
