package com.cbo.comercioBoletosOnline.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.cbo.comercioBoletosOnline.models.entity.PeliculaEntity;

public interface IPeliculaDao extends JpaRepository<PeliculaEntity, Long> {

	@Query(value = "Select peliculas.* from peliculas,cinemas where peliculas.cinemas_id = cinemas.Id and cinemas.ciudad = :nombreCiudad group by (peliculas.id)",nativeQuery = true)
    List<PeliculaEntity> findByCiudad(@Param("nombreCiudad") String nombreCiudad );
	
	

	@Query(value = "Select peliculas.* from peliculas where peliculas.cinemas_id = :idCinema",nativeQuery = true)
    List<PeliculaEntity> findByIdCinema(@Param("idCinema") Long idCinema );
}
