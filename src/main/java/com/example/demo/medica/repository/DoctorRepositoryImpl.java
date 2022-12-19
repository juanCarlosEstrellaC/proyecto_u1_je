package com.example.demo.medica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.medica.modelo.Doctor;

@Repository
public class DoctorRepositoryImpl implements IDoctorRepository{

	private static List<Doctor> base = new ArrayList<>();
	
	
	@Override
	public Doctor buscar(String id) {
		Doctor doctor = null;
		for (Doctor m : base) {
			if (m.getCedula().equals(id)) {
				doctor = m;
			}
		}
		return doctor;
	}

	@Override
	public void insertar(Doctor medico) {
		base.add(medico);
	}

	@Override
	public void actualizar(Doctor doctor) {
		Doctor miDoctor = null;
		for (Doctor m : base) {
			if (m.getCedula().equals(doctor.getCedula())) {
				miDoctor = m;
			}
		}
		base.remove(miDoctor);
		base.add(doctor);
	}

	@Override
	public void borrar(String id) {
		base.remove(this.buscar(id));
	}

}
