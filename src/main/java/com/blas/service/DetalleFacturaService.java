package com.blas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blas.dao.DetalleFacturaDAO;
import com.blas.dao.FacturaDAO;
import com.blas.model.DetalleFactura;
import com.blas.model.Factura;

@Service
public class DetalleFacturaService {

	@Autowired
	DetalleFacturaDAO dtfactdao;
	
	public void guardarDTFactura(DetalleFactura dtfactura ) {
		dtfactdao.save(dtfactura);
	}
	
	
	public void eliminarDTFactura(String codigo_factura ) {
		dtfactdao.DeleteDTFacturaByCod(codigo_factura);
	}
	
	public List<DetalleFactura> ListDTFacturaBYRuc(String ruc){
		return dtfactdao.findDTFacturaBYRuc(ruc);
	}
}
