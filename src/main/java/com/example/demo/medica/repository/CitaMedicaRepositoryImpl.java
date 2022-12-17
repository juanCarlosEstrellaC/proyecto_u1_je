package com.example.demo.medica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.medica.modelo.CitaMedica;

@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{

	private static List<CitaMedica> base = new ArrayList<>();


	@Override
	public void insertar(CitaMedica citaMedica) {
		base.add(citaMedica);
	}

}
