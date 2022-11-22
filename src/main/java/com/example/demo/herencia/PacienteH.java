package com.example.demo.herencia;

public class PacienteH {
	

	private String nombre;
	private String cedula;
	private String tipo; 	//Sirve para saber si es paciente niño o 3ra edad
	
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
