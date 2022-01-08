package com.blas.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blas.model.DetalleFactura;
import com.blas.model.Factura;

@Repository
public interface DetalleFacturaDAO extends JpaRepository<DetalleFactura, Integer> {

	@Modifying
	@Query(value="{delete from detallefactura  where codigo_factura=:codigo_factura) }",nativeQuery = true)
	public void DeleteDTFacturaByCod(String codigo_factura );
	

	@Query(value="{call ListDetalleFacturaByRUC(:ruc) }",nativeQuery = true)
	public List<DetalleFactura> findDTFacturaBYRuc(@Param("ruc") String ruc );
	
	
}
