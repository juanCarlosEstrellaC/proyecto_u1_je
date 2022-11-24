package com.example.demo;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.springBoot.CitaMedicaSB;
import com.example.demo.springBoot.MedicoSB;
import com.example.demo.springBoot.PacienteSB;
import com.example.demo.springBoot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1DcApplication implements CommandLineRunner {

	@Autowired
	private PacienteTerceraEdadSB pacienteTerceraEdadSB;
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
		System.out.println(pacienteTerceraEdadSB);
		
		this.pacienteTerceraEdadSB.setCodigoIESS("ghksjf789");
		this.pacienteTerceraEdadSB.setCedula("1234567");
		this.pacienteTerceraEdadSB.setNombre("Daniel");
		this.pacienteTerceraEdadSB.setTipo("TE");
		
		this.medicoSB.setCedula("12345");
		this.medicoSB.setNombre("Diana");
		
		System.out.println("PacienteTe");
		citaMedicaSB.agendar(pacienteTerceraEdadSB, "12",  LocalDateTime.of(2022,12,2,8,30), medicoSB);

	}

}
