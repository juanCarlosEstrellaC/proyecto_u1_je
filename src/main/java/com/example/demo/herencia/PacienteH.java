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
	
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
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
	

		

}
