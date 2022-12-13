package com.example.demo.tienda.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Factura {

	private String numero;
	private LocalDateTime fecha;
	private Cliente cliente;
	private BigDecimal subtotal, iva, total;
	private List<Detalle> detalle;
	
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", fecha=" + fecha + ", cliente=" + cliente + "]";
	}
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public BigDecimal getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}


	public BigDecimal getIva() {
		return iva;
	}


	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}


	public BigDecimal getTotal() {
		return total;
	}


	public void setTotal(BigDecimal total) {
		this.total = total;
	}


	public List<Detalle> getDetalle() {
		return detalle;
	}


	public void setDetalle(List<Detalle> detalle) {
		this.detalle = detalle;
	}
	
	
}
