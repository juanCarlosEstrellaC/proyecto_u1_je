package com.example.demo;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.banco.service.ITransferenciaService;
import com.example.demo.springBoot.CitaMedicaSB;
import com.example.demo.springBoot.MedicoSB;
import com.example.demo.springBoot.PacienteCancerSB;
import com.example.demo.springBoot.PacienteSB;
import com.example.demo.springBoot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1DcApplication implements CommandLineRunner {

	@Autowired
	private ICuentaBancariaService bancariaService;
	
	//Mio:
//	@Autowired
//	private ITransferenciaService iTransferenciaService;
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNumero("0001");
		cuenta1.setTipo("A");
		cuenta1.setTitular("Pepe Perez");
		cuenta1.setSaldo(new BigDecimal(100));
		this.bancariaService.insertar(cuenta1);
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("0002");
		cuenta2.setTipo("A");
		cuenta2.setTitular("Diana Teran");
		cuenta2.setSaldo(new BigDecimal(200));
		this.bancariaService.insertar(cuenta2);
		
		System.out.println("reporte 1");
		for (Transferencia t: this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		}
		
		this.iTransferenciaService.realizar("0001", "0002", new BigDecimal(10));
		
		System.out.println("reporte 2");
		for (Transferencia t: this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		}
		
		//MIO:
//		System.out.println("mio");
//		this.iTransferenciaService.buscarReporte(cuenta1.getNumero());
	}

}
