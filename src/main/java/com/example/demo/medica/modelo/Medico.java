package com.example.demo.medica.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Medico {
	
	private String nombre;
	private String apellido;
	private String cedula;
	private LocalDateTime fechaNacimiento;
	private String especialidad;
	private BigDecimal precioConsulta;


	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fechaNacimiento="
				+ fechaNacimiento + ", especialidad=" + especialidad + ", precioConsulta=" + precioConsulta + "]";
	}

	//GET Y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public BigDecimal getPrecioConsulta() {
		return precioConsulta;
	}

	public void setPrecioConsulta(BigDecimal precioConsulta) {
		this.precioConsulta = precioConsulta;
	}
	
	
	
	
}
