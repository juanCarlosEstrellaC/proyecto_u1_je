package com.example.demo.ejercicio1.service.qualifiers;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("pesado")
public class MatriculaNuevaPesadoServiceImpl implements IMatriculaNuevaService {

	@Override
	public BigDecimal calculoSubtotal(BigDecimal precio) {
		BigDecimal subtotal = precio.multiply(new BigDecimal(0.15));
		return subtotal;
	}

}
