package com.example.demo;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.springBoot.CitaMedicaSB;
import com.example.demo.springBoot.MedicoSB;
import com.example.demo.springBoot.PacienteCancerSB;
import com.example.demo.springBoot.PacienteSB;
import com.example.demo.springBoot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1DcApplication implements CommandLineRunner {

	@Autowired
	private PacienteTerceraEdadSB pacienteTE;
	
	@Autowired
	private PacienteCancerSB cancerSB;
	
	@Autowired
	private CitaMedicaSB citaMedicaSB;
	
	@Autowired
	private MedicoSB medicoSB;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring Boot");
		System.out.println(pacienteTE);
		
		this.pacienteTE.setCodigoIESS("ghksjf789");
		this.pacienteTE.setCedula("1234567");
		this.pacienteTE.setNombre("Edison");
		this.pacienteTE.setTipo("TE");
		
		this.cancerSB.setCedula("09876543");
		this.cancerSB.setNombre("Daniel");
		this.cancerSB.setTipo("C");
		
		this.medicoSB.setCedula("12345");
		this.medicoSB.setNombre("Diana");
		
		System.out.println("PacienteTe");
		citaMedicaSB.agendar(cancerSB, "12",  LocalDateTime.of(2022,12,2,8,30), medicoSB);

	}

}
