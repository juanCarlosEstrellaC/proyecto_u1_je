package com.example.demo.medica.service;

import java.time.LocalDateTime;

public interface ICitaMedicaService {

	public void agendar(String cedulaPaciente, String cedulaMedico, LocalDateTime fecha);
	
}
