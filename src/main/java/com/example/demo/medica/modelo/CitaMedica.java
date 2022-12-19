package com.example.demo.medica.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaMedica {

	private LocalDateTime fecha;
	private BigDecimal precio;
	private Paciente paciente;
	private Doctor doctor;
	

	
	@Override
	public String toString() {
		return "CitaMedica [fecha=" + fecha + ", precio=" + precio + ", paciente=" + paciente + ", medico=" + doctor
				+ "]";
	}
	//GET Y SET



	public LocalDateTime getFecha() {
		return fecha;
	}



	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}



	public BigDecimal getPrecio() {
		return precio;
	}



	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}



	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



	public Doctor getMedico() {
		return doctor;
	}



	public void setMedico(Doctor medico) {
		this.doctor = medico;
	}
	
	
	
	
}
