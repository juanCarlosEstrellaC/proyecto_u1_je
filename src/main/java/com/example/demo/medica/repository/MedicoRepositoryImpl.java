package com.example.demo.medica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.medica.modelo.Medico;

@Repository
public class MedicoRepositoryImpl implements IMedicoRepository{

	private static List<Medico> base = new ArrayList<>();
	
	
	@Override
	public Medico buscar(String id) {
		Medico medico = null;
		for (Medico m : base) {
			if (m.getCedula().equals(id)) {
				medico = m;
			}
		}
		return medico;
	}

	@Override
	public void insertar(Medico medico) {
		base.add(medico);
	}

	@Override
	public void actualizar(Medico medico) {
		Medico miMedico = null;
		for (Medico m : base) {
			if (m.getCedula().equals(medico.getCedula())) {
				miMedico = m;
			}
		}
		base.remove(miMedico);
		base.add(medico);
	}

	@Override
	public void borrar(String id) {
		base.remove(this.buscar(id));
	}

}
