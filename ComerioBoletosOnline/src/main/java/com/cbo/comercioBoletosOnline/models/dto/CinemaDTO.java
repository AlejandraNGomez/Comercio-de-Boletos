package com.cbo.comercioBoletosOnline.models.dto;

import org.springframework.stereotype.Service;

import com.cbo.comercioBoletosOnline.models.entity.CinemaEntity;
import com.cbo.comercioBoletosOnline.models.pojo.Cinema;

@Service
public class CinemaDTO {

	public Cinema createPOJOfromEntity(CinemaEntity cinemas) {

		return new Cinema(cinemas.getId(), cinemas.getNombre(), cinemas.getRepresentanteLegalNombre(),
				cinemas.getRepresentanteLegalIdentificacion(), cinemas.getFechaConstitucion(), cinemas.getCiudad(),
				cinemas.getTelefono(), cinemas.getEmail(), cinemas.getDireccion(), cinemas.getCantidadSalas(),cinemas.getLatitud(),cinemas.getLongitud());
	}

	public CinemaEntity createEntityfromPOJO(Cinema cinema) {

		return new CinemaEntity(cinema.getId(), cinema.getNombre(), cinema.getRepresentanteLegalNombre(),
				cinema.getRepresentanteLegalIdentificacion(), cinema.getFechaConstitucion(), cinema.getCiudad(),
				cinema.getTelefono(), cinema.getEmail(), cinema.getDireccion(), cinema.getCantidadSalas(),cinema.getLatitud(),cinema.getLongitud());
	}
}
