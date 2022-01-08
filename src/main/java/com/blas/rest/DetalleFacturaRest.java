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

import com.blas.model.DetalleFactura;
import com.blas.model.Factura;
import com.blas.service.DetalleFacturaService;
import com.blas.service.FacturaService;

@RestController
@RequestMapping("dtfactura")
public class DetalleFacturaRest {

	
	@Autowired
	DetalleFacturaService dtFacturaService;
	
	@PostMapping("/save")
	public ResponseEntity<String> guardarDTFactura(@RequestBody DetalleFactura detalleFactura) {
		dtFacturaService.guardarDTFactura(detalleFactura);
		return ResponseEntity.ok("Registro de detalle Factura correcta");
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<String> deleteDTFactura(@PathVariable("id") String id) {
		dtFacturaService.eliminarDTFactura(id);
		return ResponseEntity.ok("Detalle Factura ELIMINADO ");
	}
	
	@GetMapping("/listar/{ruc}")
	public List<DetalleFactura> ListDTFacturaBYRuc(@PathVariable("ruc") String ruc) {
		
		return dtFacturaService.ListDTFacturaBYRuc(ruc);
	}
	
	
	
	
	
}
