package com.example.demo.springBoot;

import org.springframework.stereotype.Component;

@Component
public class MedicoSB {

	private String nombre;
	private String cedula;
	
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	
	
}
