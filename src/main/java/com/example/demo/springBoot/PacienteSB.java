package com.example.demo.springBoot;

public class PacienteSB {
	

	public String nombre;
	public String cedula;
	public String tipo; 	//Sirve para saber si es paciente niño o 3ra edad
	
	protected Integer calcularDescuento() {
		System.out.println("sin descuento");
		return 0;
	}
	
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	
		protected String getTipo() {
			return tipo;
		}
		protected void setTipo(String tipo) {
			this.tipo = tipo;
		}
		protected String getNombre() {
			return nombre;
		}
		protected void setNombre(String nombre) {
			this.nombre = nombre;
		}
		protected String getCedula() {
			return cedula;
		}
		protected void setCedula(String cedula) {
		this.cedula = cedula;
	}
	

		

}
