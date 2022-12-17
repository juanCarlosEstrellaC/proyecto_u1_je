package com.example.demo;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.medica.modelo.Medico;
import com.example.demo.medica.modelo.Paciente;
import com.example.demo.medica.service.ICitaMedicaService;
import com.example.demo.medica.service.IMedicoService;
import com.example.demo.medica.service.IPacienteService;

@SpringBootApplication
public class ProyectoU1DcApplication implements CommandLineRunner {

	@Autowired
	private IMedicoService iMedicoService;
	
	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	private ICitaMedicaService iCitaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// opcion 1
		Medico med = new Medico();
		med.setNombre("Fuquido");
		med.setApellido("Nakamoto");
		med.setCedula("486546566");
		med.setEspecialidad("Traumatólogo");
		med.setPrecioConsulta(new BigDecimal(56));
		med.setFechaNacimiento(LocalDateTime.of(1987, 2, 1, 1, 1));

		System.out.println(med);
		this.iMedicoService.crear(med);
		
		
		med.setPrecioConsulta(new BigDecimal(10));
		this.iMedicoService.modificar(med);
		System.out.println(med);

		
		//Opción 2
		Paciente pacie = new Paciente();
		pacie.setNombre("Jose");
		pacie.setApellido("Cardenas");
		pacie.setFechaNacimiento(LocalDateTime.of(1985, 7,7,12,35));
		pacie.setCedula("184965486");
		
		this.iPacienteService.guardar(pacie);
		
		
		//Opcion 3:
		this.iCitaMedicaService.agendar(pacie.getCedula(), med.getCedula());

	}

}
