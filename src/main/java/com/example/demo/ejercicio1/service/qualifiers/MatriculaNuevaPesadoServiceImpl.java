package com.example.demo.ejercicio1.service.qualifiers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service("pesado")
public class MatriculaNuevaPesadoServiceImpl implements IMatriculaNuevaService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Override
	public BigDecimal matricular(String cedula, String placa) {
		Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
		BigDecimal valor = vehiculo.getPrecio().multiply(new BigDecimal(0.15));
		return valor;
	}

}
