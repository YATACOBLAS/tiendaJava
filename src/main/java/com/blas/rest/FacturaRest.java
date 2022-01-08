package com.blas.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blas.model.Factura;
import com.blas.service.FacturaService;

@RestController
@RequestMapping("factura")
public class FacturaRest {

	
	@Autowired
	FacturaService facturaService;
	
	@PostMapping("/updateFacturaByCod")
	public ResponseEntity<String> updateFacturaByCod(@RequestBody Factura factura) {
		
		facturaService.UpdateFacturaByCod(factura.getCodigo(),factura.getNombreCliente(),factura.getRuc(), factura.getDireccion());
		return ResponseEntity.ok("actualizacion Factura correcta");
	}
	
	@GetMapping("/listar/{ruc}")
	public Factura ListFacturaByRUC(@PathVariable String ruc) {
		
		Factura factura = facturaService.ListFacturaByRUC(ruc);
		return factura;
	}
	
	@GetMapping("/listar")
	public List<Factura> ListFactura() {		 
		return facturaService.listarFactura();
	}
	
}
