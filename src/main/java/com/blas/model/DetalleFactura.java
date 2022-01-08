package com.blas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detallefactura")
public class DetalleFactura {


	@Id
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "producto")
	private String producto;
	
	@Column(name = "cantidad")
	private int cantidad ;
	
	@Column(name = "precio")
	private int precio;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "codigo_factura")
	private Factura factura;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
	
	
	
}
