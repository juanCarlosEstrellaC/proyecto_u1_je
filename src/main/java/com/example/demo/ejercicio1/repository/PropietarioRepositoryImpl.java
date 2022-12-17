package com.example.demo.ejercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio1.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository  {

	private static List<Propietario> base = new ArrayList<>();

	//este método no es parte de la interface, porque no se pidió, pero lo necesito. Podría ser private tranquilamente.
	
	public Propietario buscar(String cedula) {
		Propietario propietario = null;
		for (Propietario p : base) {
			if (p.getCedula().equals(cedula)) {
				propietario = p;
			}
		}
		return propietario;
	}
	
	
	@Override
	public void insertar(Propietario propietario) {
		base.add(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		base.remove(this.buscar(cedula));
	}

}
