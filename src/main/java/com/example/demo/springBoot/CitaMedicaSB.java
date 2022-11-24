package com.example.demo.springBoot;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;


@Service
public class CitaMedicaSB {

	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private MedicoSB medico;
	private PacienteSB paciente;
	
	public void agendar(PacienteSB ph, String numero, LocalDateTime fechaCita, MedicoSB mh) {
		this.numero=numero;
		this.fechaCita=fechaCita;
		this.fechaAgenda = LocalDateTime.now();
		this.medico = mh;
		this.paciente = ph;
		
		Integer valorDescuento = ph.calcularDescuento();
		System.out.println("Valor" +valorDescuento);
		
		this.guardarCita(this);
	}
	
	private void guardarCita(CitaMedicaSB cita) {	
		//Insertar en la base de datos, guardar cita
		System.out.println(cita);
	}
	
	@Override
	public String toString() {
		return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + "]";
	}

		// SET y GET
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public LocalDateTime getFechaCita() {
			return fechaCita;
		}
		public void setFechaCita(LocalDateTime fechaCita) {
			this.fechaCita = fechaCita;
		}
		public LocalDateTime getFechaAgenda() {
			return fechaAgenda;
		}
		public void setFechaAgenda(LocalDateTime fechaAgenda) {
			this.fechaAgenda = fechaAgenda;
		}
		public MedicoSB getMedico() {
			return medico;
		}
		public void setMedico(MedicoSB medico) {
			this.medico = medico;
		}
		public PacienteSB getPaciente() {
			return paciente;
		}
		public void setPaciente(PacienteSB paciente) {
		this.paciente = paciente;
	}



}
