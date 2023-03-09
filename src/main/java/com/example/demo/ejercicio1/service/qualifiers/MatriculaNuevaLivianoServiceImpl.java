package com.example.demo.ejercicio1.service.qualifiers;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("liviano")
public class MatriculaNuevaLivianoServiceImpl implements IMatriculaNuevaService {

	@Override
	public BigDecimal calculoSubtotal(BigDecimal precio) {
		BigDecimal subtotal = precio.multiply(new BigDecimal(0.10));
		return subtotal;
	}

}
