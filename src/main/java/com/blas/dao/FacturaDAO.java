package com.blas.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blas.model.Factura;

@Repository
public interface FacturaDAO extends JpaRepository<Factura, Integer> {

	@Modifying
	@Query(value="{update factura set nombre_cliente=:nombreCliente, RUC=:ruc, direccion=:direccion where codigo=:codigo) }",nativeQuery = true)
	 int UpdateFacturaByCod(   String nombreCliente, String ruc, String direccion,int codigo);
	
	
	@Query(value="{call ListFacturaByRUC(:ruc) }",nativeQuery = true)
	Factura ListFacturaByRUC(@Param("ruc") String ruc);
	

}
