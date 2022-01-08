package com.blas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blas.dao.FacturaDAO;
import com.blas.model.Factura;

@Service
public class FacturaService {

	@Autowired
	FacturaDAO facturaDAO;
	public void UpdateFacturaByCod(int codigo, String nombreCliente, String ruc, String direccion) {
		facturaDAO.UpdateFacturaByCod( nombreCliente, ruc, direccion,codigo);
	}
	
	public Factura ListFacturaByRUC( String ruc){
	return  facturaDAO.ListFacturaByRUC(ruc);
	
	}
	
	public List<Factura> listarFactura(){
		return facturaDAO.findAll();
	}
	
}
