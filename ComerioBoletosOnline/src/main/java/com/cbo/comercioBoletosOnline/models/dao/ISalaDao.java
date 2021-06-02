package com.cbo.comercioBoletosOnline.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.cbo.comercioBoletosOnline.models.entity.SalaEntity;

public interface ISalaDao extends CrudRepository<SalaEntity, Long> {

}
