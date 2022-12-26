package com.example.demo;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IGestorMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;

@SpringBootApplication
public class ProyectoU1DcApplication implements CommandLineRunner {
		
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IGestorMatriculaService gestorMatriculaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DcApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		//Opcion 1
		Vehiculo vehi = new Vehiculo();
		vehi.setMarca("Toyta");
		vehi.setPlaca("PDF12654");
		vehi.setPrecio(new BigDecimal(20000));
		vehi.setTipo("L");
		this.iVehiculoService.crear(vehi);

		vehi.setPrecio(new BigDecimal(10000));
		vehi.setMarca("Toyota");
		this.iVehiculoService.modificar(vehi);
		
		
		//Opcion 2
		Propietario propietario = new Propietario();
		propietario.setApellido("Colon");
		propietario.setCedula("154774566");
		propietario.setFechaNacimiento(LocalDateTime.of(1978,8,31,12,35));
		propietario.setNombre("Edison");
		this.iPropietarioService.guardar(propietario);
		 
		
		this.gestorMatriculaService.matricular("154774566", "PDF12654");
	}

}
