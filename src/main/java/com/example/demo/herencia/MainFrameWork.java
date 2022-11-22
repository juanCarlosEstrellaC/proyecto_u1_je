package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFrameWork {

	public static void main(String[] args) {
		
//		PacienteH pacienteTE = new PacienteTerceraEdadH();
//		pacienteTE.setCedula("1234567");
//		pacienteTE.setNombre("Daniel");
//		pacienteTE.setTipo("TE");
		
		PacienteH pacienteC = new PacienteCancerH();
		pacienteC.setCedula("1234567");
		pacienteC.setNombre("Daniel");
		pacienteC.setTipo("C");
		
		MedicoH medico = new MedicoH();
		medico.setCedula("12345");
		medico.setNombre("Diana");
		
		CitaMedicaH cita = new CitaMedicaH();
		
//		cita.agendar(pacienteTE, "12",  LocalDateTime.of(2022,12,2,8,30), medico);
		cita.agendar(pacienteC, "12",  LocalDateTime.of(2022,12,2,8,30), medico);

	}

}
 