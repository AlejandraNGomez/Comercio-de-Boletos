package com.cbo.comercioBoletosOnline.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cbo.comercioBoletosOnline.models.entity.BoletoEntity;

public interface IBoletoDao extends CrudRepository<BoletoEntity, Long> {
	@Query(value = "Select boleto.* from boleto where cedula_cliente = :cedCliente",nativeQuery = true)
    List<BoletoEntity> findByCedId(@Param("cedCliente") Long cedCliente );
	

}
