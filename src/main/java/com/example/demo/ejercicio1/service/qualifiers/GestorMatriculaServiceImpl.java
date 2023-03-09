package com.example.demo.ejercicio1.service.qualifiers;

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
	private IVehiculoRepository iVehiculoRepository;

	@Autowired
	private IMatriculaRepository iMatriculaRepository;

	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Autowired
	@Qualifier("pesado")
	private IMatriculaNuevaService iMatriculaNuevaServicePesado;

	@Autowired
	@Qualifier("liviano")
	private IMatriculaNuevaService iMatriculaNuevaServiceLiviano;

	@Override
	public BigDecimal matricular(String cedula, String placa) {
		Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
		Propietario propietario = this.iPropietarioRepository.buscar(cedula);
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		matricula.setVehiculo(vehiculo);
		matricula.setPropietario(propietario);

		BigDecimal valor = null;

		if (vehiculo.getTipo().equals("P")) {
			valor = this.iMatriculaNuevaServicePesado.matricular(cedula, placa);
		} else {
			valor = this.iMatriculaNuevaServiceLiviano.matricular(cedula, placa);
		}

		// Programo descuento
		if (valor.compareTo(new BigDecimal(2000)) == 1) {
			BigDecimal descuento = valor.multiply(new BigDecimal(0.07));
			valor = valor.subtract(descuento);
		}

		matricula.setValor(valor);

		this.iMatriculaRepository.insertar(matricula);
		return valor;
	}

}
