package com.example.demo.ejercicio1.service;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IMatriculaRepository;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService {

	@Autowired
	@Qualifier("pesado")
	private IMatriculaNuevaService iMatriculaServicePesado;
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaNuevaService iMatriculaServiceLiviano;
	
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Override
	public void matricular(String cedula, String placa) {
		
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		Propietario pro = this.iPropietarioRepository.buscar(cedula);
		Vehiculo vehi=this.iVehiculoRepository.buscar(placa);
		matricula.setPropietario(pro);
		matricula.setVehiculo(vehi);
		
		BigDecimal valor = null;
		if (vehi.getTipo().equals("P")) {
			valor = this.iMatriculaServicePesado.matricular(vehi.getPrecio());  //esto es lo nuevo
			System.out.println("Su vehiculo es pesado");
		} else {

			valor = this.iMatriculaServiceLiviano.matricular(vehi.getPrecio()); //esto es lo nuevo
			System.out.println("Su vehiculo es Liviano");
		}
		
		//Programo descuento
		if(valor.compareTo(new BigDecimal(2000))>1) {
			BigDecimal descuento= valor.multiply(new BigDecimal(7));
			descuento= descuento.divide(new BigDecimal(100));
			valor = valor.subtract(descuento);
			
		}
		matricula.setValor(valor);
		this.iMatriculaRepository.insertar(matricula);
		System.out.println("Se matriculo el vehiculo " + matricula);
		System.out.println("El valor fue: " + valor);

	}

}
