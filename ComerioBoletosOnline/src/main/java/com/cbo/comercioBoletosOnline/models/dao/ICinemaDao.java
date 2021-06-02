package com.cbo.comercioBoletosOnline.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.cbo.comercioBoletosOnline.models.entity.CinemaEntity;

public interface ICinemaDao extends CrudRepository<CinemaEntity, Long> {

}
