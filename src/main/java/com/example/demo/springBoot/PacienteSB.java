package com.example.demo.springBoot;

public class PacienteSB {
	
	private String nombre;
	private String cedula;
	private String tipo; 	
	
	protected Integer calcularDescuento() {
		System.out.println("sin descuento");
		return 0;
	}

	@Override
	public String toString() {
		return "PacienteSB [nombre=" + nombre + ", cedula=" + cedula + ", tipo=" + tipo + "]";
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
