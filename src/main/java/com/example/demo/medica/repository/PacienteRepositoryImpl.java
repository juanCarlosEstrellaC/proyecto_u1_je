package com.example.demo.medica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.medica.modelo.Paciente;

@Repository
public class PacienteRepositoryImpl implements IPacienteRepository  {

	private static List<Paciente> base = new ArrayList<>();

	// El método buscar, aunque no fue requisito en la prueba, se lo crea por necesidad. Podría ser private tranquilamente.
	@Override
	public Paciente buscar(String cedula) {
		Paciente paciente = null;
		for (Paciente p : base) {
			if (p.getCedula().equals(cedula)) {
				paciente = p;
			}
		}
		return paciente;
	}
	
	
	@Override
	public void insertar(Paciente paciente) {
		base.add(paciente);
	}

	@Override
	public void eliminar(String cedula) {
		base.remove(this.buscar(cedula));
	}

}
