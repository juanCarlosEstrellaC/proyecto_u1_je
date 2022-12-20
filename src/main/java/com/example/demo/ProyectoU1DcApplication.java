package com.example.demo;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaNuevaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;

@SpringBootApplication
public class ProyectoU1DcApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// opcion 1
		Vehiculo vehi = new Vehiculo();
		vehi.setMarca("Toyota");
		vehi.setPlaca("POI34564");
		vehi.setPrecio(new BigDecimal(20000));
		vehi.setTipo("P");
		
		this.iVehiculoService.crear(vehi);
		
		
		vehi.setPrecio(new BigDecimal(10000));
		vehi.setMarca("Tadsyota");
		
		this.iVehiculoService.modificar(vehi);
		
		//Opción 2
		Propietario propietario = new Propietario();
		propietario.setNombre("Jose");
		propietario.setApellido("Cardenas");
		propietario.setFechaNacimiento(LocalDateTime.of(1985, 7,7,12,35));
		propietario.setCedula("184965486");
		
		this.iPropietarioService.guardar(propietario);
		
		
		
		//Opcion 3:

	}

}
