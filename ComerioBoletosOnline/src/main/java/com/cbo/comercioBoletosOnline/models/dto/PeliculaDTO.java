package com.cbo.comercioBoletosOnline.models.dto;

import org.springframework.stereotype.Service;

import com.cbo.comercioBoletosOnline.models.entity.PeliculaEntity;
import com.cbo.comercioBoletosOnline.models.pojo.Cinema;
import com.cbo.comercioBoletosOnline.models.pojo.Pelicula;
import com.cbo.comercioBoletosOnline.models.pojo.Sala;

@Service
public class PeliculaDTO {
		
	public Pelicula createPOJOfromEntity(PeliculaEntity peliculas) {
		Cinema cinema = new Cinema();
		cinema.setId(peliculas.getCinemasId());
		Sala sala = new Sala();
		sala.setId(peliculas.getSalasId());
		return new Pelicula(peliculas.getId(), peliculas.getNombre(), cinema, peliculas.getCaratula(),
				peliculas.getDescripcion(), peliculas.getCategoria(), sala);
	}

	public PeliculaEntity createEntityfromPOJO(Pelicula pelicula) {

		return new PeliculaEntity(pelicula.getId(), pelicula.getNombre(), pelicula.getCinema().getId(), pelicula.getCaratula(),
				pelicula.getDescripcion(), pelicula.getCategoria(), pelicula.getSala().getId());
	}
}
